package quanlynhanvien;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

// Uncomment these imports if you have Apache POI in your classpath
// import org.apache.poi.ss.usermodel.*;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Utility class để xuất dữ liệu ra Excel/CSV với hỗ trợ UTF-8
 */
public class ExcelExporter {
    
    /**
     * Xuất JTable ra file CSV với UTF-8 encoding
     */
    public static void exportTableToCSV(JTable table, String fileName) {
        try {
            TableModel model = table.getModel();
            
            // Sử dụng OutputStreamWriter với UTF-8 encoding và BOM
            FileOutputStream fos = new FileOutputStream(fileName + ".csv");
            // Thêm BOM để Excel nhận diện UTF-8
            fos.write(0xEF);
            fos.write(0xBB);
            fos.write(0xBF);
            
            OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            
            // Ghi header
            for (int i = 0; i < model.getColumnCount(); i++) {
                String columnName = model.getColumnName(i);
                // Wrap trong quotes để tránh lỗi với dấu phẩy
                writer.write("\"" + columnName + "\"");
                if (i < model.getColumnCount() - 1) {
                    writer.write(",");
                }
            }
            writer.write("\n");
            
            // Ghi dữ liệu
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object value = model.getValueAt(i, j);
                    String cellValue = (value != null) ? value.toString() : "";
                    // Wrap trong quotes để tránh lỗi với dấu phẩy và ký tự đặc biệt
                    writer.write("\"" + cellValue.replace("\"", "\"\"") + "\"");
                    if (j < model.getColumnCount() - 1) {
                        writer.write(",");
                    }
                }
                writer.write("\n");
            }
            
            writer.close();
            fos.close();
            
            JOptionPane.showMessageDialog(null, 
                "Xuất file CSV thành công: " + fileName + ".csv\n" +
                "Lưu ý: Mở file bằng Excel và chọn encoding UTF-8 nếu cần thiết.");
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất file CSV: " + e.getMessage());
        }
    }
    
    /**
     * Xuất JTable ra file Excel thật sự (cần Apache POI)
     * Uncomment method này nếu bạn đã thêm Apache POI vào project
     */
    /*
    public static void exportTableToExcel(JTable table, String fileName) {
        try {
            TableModel model = table.getModel();
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Data");
            
            // Tạo style cho header
            CellStyle headerStyle = workbook.createCellStyle();
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setColor(IndexedColors.WHITE.getIndex());
            headerStyle.setFont(headerFont);
            headerStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            
            // Tạo header row
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < model.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(model.getColumnName(i));
                cell.setCellStyle(headerStyle);
            }
            
            // Tạo data rows
            for (int i = 0; i < model.getRowCount(); i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Cell cell = row.createCell(j);
                    Object value = model.getValueAt(i, j);
                    if (value != null) {
                        if (value instanceof Number) {
                            cell.setCellValue(((Number) value).doubleValue());
                        } else if (value instanceof Date) {
                            cell.setCellValue((Date) value);
                        } else {
                            cell.setCellValue(value.toString());
                        }
                    }
                }
            }
            
            // Auto-size columns
            for (int i = 0; i < model.getColumnCount(); i++) {
                sheet.autoSizeColumn(i);
            }
            
            // Ghi file
            FileOutputStream fileOut = new FileOutputStream(fileName + ".xlsx");
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            
            JOptionPane.showMessageDialog(null, "Xuất file Excel thành công: " + fileName + ".xlsx");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất file Excel: " + e.getMessage());
        }
    }
    */
    
    /**
     * Tạo báo cáo tổng hợp với UTF-8 encoding
     */
    public static void createSummaryReport(String totalEmployees, String totalDepartments, 
                                         String totalContracts, String totalPayrolls) {
        try {
            String fileName = "BaoCaoTongHop_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            
            // Sử dụng OutputStreamWriter với UTF-8 encoding
            FileOutputStream fos = new FileOutputStream(fileName + ".txt");
            OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            
            writer.write("=== BÁO CÁO THỐNG KÊ TỔNG HỢP ===");
            writer.write("\nNgày tạo: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
            writer.write("\n\n1. THỐNG KÊ TỔNG QUAN:");
            writer.write("\n   - Tổng số nhân viên: " + totalEmployees);
            writer.write("\n   - Tổng số phòng ban: " + totalDepartments);
            writer.write("\n   - Tổng số hợp đồng: " + totalContracts);
            writer.write("\n   - Tổng số bảng lương: " + totalPayrolls);
            writer.write("\n\n2. PHÂN TÍCH:");
            writer.write("\n   - Tỷ lệ nhân viên/phòng ban: " + 
                        calculateRatio(totalEmployees, totalDepartments));
            writer.write("\n   - Tỷ lệ hợp đồng/nhân viên: " + 
                        calculateRatio(totalContracts, totalEmployees));
            writer.write("\n\n3. GHI CHÚ:");
            writer.write("\n   - Dữ liệu được thống kê tại thời điểm tạo báo cáo");
            writer.write("\n   - Các số liệu có thể thay đổi theo thời gian");
            writer.write("\n   - Liên hệ bộ phận IT để được hỗ trợ thêm");
            writer.write("\n\n4. KHUYẾN NGHỊ:");
            writer.write("\n   - Nên cập nhật dữ liệu định kỳ");
            writer.write("\n   - Backup dữ liệu thường xuyên");
            
            writer.close();
            fos.close();
            
            JOptionPane.showMessageDialog(null, "Tạo báo cáo thành công: " + fileName + ".txt");
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi tạo báo cáo: " + e.getMessage());
        }
    }
    
    /**
     * Tính tỷ lệ giữa hai số
     */
    private static String calculateRatio(String numerator, String denominator) {
        try {
            double num = Double.parseDouble(numerator);
            double den = Double.parseDouble(denominator);
            if (den == 0) return "N/A";
            return String.format("%.2f", num / den);
        } catch (NumberFormatException e) {
            return "N/A";
        }
    }
    
    /**
     * Xuất nhiều bảng vào một file CSV
     */
    public static void exportMultipleTablesToCSV(JTable[] tables, String[] sheetNames, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName + "_TatCa.csv");
            // Thêm BOM để Excel nhận diện UTF-8
            fos.write(0xEF);
            fos.write(0xBB);
            fos.write(0xBF);
            
            OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            
            for (int tableIndex = 0; tableIndex < tables.length; tableIndex++) {
                if (tableIndex > 0) {
                    writer.write("\n\n"); // Phân cách giữa các bảng
                }
                
                writer.write("=== " + sheetNames[tableIndex] + " ===\n");
                
                JTable table = tables[tableIndex];
                TableModel model = table.getModel();
                
                // Ghi header
                for (int i = 0; i < model.getColumnCount(); i++) {
                    writer.write("\"" + model.getColumnName(i) + "\"");
                    if (i < model.getColumnCount() - 1) {
                        writer.write(",");
                    }
                }
                writer.write("\n");
                
                // Ghi dữ liệu
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        Object value = model.getValueAt(i, j);
                        String cellValue = (value != null) ? value.toString() : "";
                        writer.write("\"" + cellValue.replace("\"", "\"\"") + "\"");
                        if (j < model.getColumnCount() - 1) {
                            writer.write(",");
                        }
                    }
                    writer.write("\n");
                }
            }
            
            writer.close();
            fos.close();
            
            JOptionPane.showMessageDialog(null, 
                "Xuất tất cả bảng thành công: " + fileName + "_TatCa.csv");
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất nhiều bảng: " + e.getMessage());
        }
    }
}