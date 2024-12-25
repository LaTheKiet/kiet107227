package lathekiet;

public class Kiet107227 {
    

        // Hàm tính tổng số tiền trong ví
        public static long tongTien(int[] vi) {
            long total = 0;
            for (int i = 0; i < vi.length; i++) {
                total += vi[i];  // Cộng từng tờ tiền vào tổng
            }
            return total;
        }
    
        // Hàm tìm vị trí tờ tiền có mệnh giá nhỏ nhất đầu tiên
        public static int viTriNhoNhatDau(int[] vi) {
            int min = vi[0]; // Giả sử tờ tiền đầu tiên là nhỏ nhất
            int index = 0;  // Vị trí tờ tiền nhỏ nhất
            for (int i = 1; i < vi.length; i++) {
                if (vi[i] < min) {
                    min = vi[i]; // Cập nhật mệnh giá nhỏ nhất
                    index = i;   // Cập nhật vị trí
                }
            }
            return index;  // Trả về vị trí của tờ tiền nhỏ nhất
        }
    
        // Hàm tìm vị trí tờ tiền có mệnh giá nhỏ nhất cuối cùng
        public static int viTriNhoNhatCuoi(int[] vi) {
            int min = vi[0];
            int index = 0;
            for (int i = 1; i < vi.length; i++) {
                if (vi[i] <= min) {  // Dùng <= để lấy vị trí cuối cùng có mệnh giá nhỏ nhất
                    min = vi[i];
                    index = i;
                }
            }
            return index;
        }
    
        // Hàm tìm vị trí tờ tiền có mệnh giá lớn nhất đầu tiên
        public static int viTriLonNhatDau(int[] vi) {
            int max = vi[0];
            int index = 0;
            for (int i = 1; i < vi.length; i++) {
                if (vi[i] > max) {
                    max = vi[i];
                    index = i;
                }
            }
            return index;
        }
    
        // Hàm tìm vị trí tờ tiền có mệnh giá lớn nhất cuối cùng
        public static int viTriLonNhatCuoi(int[] vi) {
            int max = vi[0];
            int index = 0;
            for (int i = 1; i < vi.length; i++) {
                if (vi[i] >= max) {  // Dùng >= để lấy vị trí cuối cùng có mệnh giá lớn nhất
                    max = vi[i];
                    index = i;
                }
            }
            return index;
        }
    
        // Hàm sắp xếp các tờ tiền trong ví theo thứ tự tăng dần
        public static int[] sapXepTang(int[] vi) {
            int[] sorted = vi.clone(); // Tạo một bản sao của mảng vi
            for (int i = 0; i < sorted.length; i++) {
                for (int j = i + 1; j < sorted.length; j++) {
                    if (sorted[i] > sorted[j]) {  // Hoán đổi nếu tờ tiền lớn hơn
                        int temp = sorted[i];
                        sorted[i] = sorted[j];
                        sorted[j] = temp;
                    }
                }
            }
            return sorted;
        }
    
        // Hàm sắp xếp các tờ tiền trong ví theo thứ tự giảm dần
        public static int[] sapXepGiam(int[] vi) {
            int[] sorted = vi.clone();
            for (int i = 0; i < sorted.length; i++) {
                for (int j = i + 1; j < sorted.length; j++) {
                    if (sorted[i] < sorted[j]) {  // Hoán đổi nếu tờ tiền nhỏ hơn
                        int temp = sorted[i];
                        sorted[i] = sorted[j];
                        sorted[j] = temp;
                    }
                }
            }
            return sorted;
        }
    
        // Hàm thống kê số tờ tiền có mệnh giá lớn hơn 50.000
        public static int thongKe50(int[] vi) {
            int count = 0;
            for (int i = 0; i < vi.length; i++) {
                if (vi[i] > 50000) {
                    count++;
                }
            }
            return count;
        }
    
        // Hàm thống kê số tờ tiền có mệnh giá nhỏ hơn 100.000
        public static int thongKe100(int[] vi) {
            int count = 0;
            for (int i = 0; i < vi.length; i++) {
                if (vi[i] < 100000) {
                    count++;
                }
            }
            return count;
        }
    
        // Hàm main, nơi chương trình bắt đầu chạy
        public static void main(String[] args) {
            // Khai báo mảng các tờ tiền trong ví
            int[] vi = {20000, 10000, 20000, 10000, 100000, 10000, 500000, 50000, 500000, 100000, 100000, 50000, 200000, 200000, 50000};
    
            // Gọi các hàm yêu cầu và in kết quả
            System.out.println("Tổng số tiền trong ví: " + tongTien(vi));
            System.out.println("Vị trí tờ tiền có mệnh giá nhỏ nhất đầu tiên: " + viTriNhoNhatDau(vi));
            System.out.println("Vị trí tờ tiền có mệnh giá nhỏ nhất cuối cùng: " + viTriNhoNhatCuoi(vi));
            System.out.println("Vị trí tờ tiền có mệnh giá lớn nhất đầu tiên: " + viTriLonNhatDau(vi));
            System.out.println("Vị trí tờ tiền có mệnh giá lớn nhất cuối cùng: " + viTriLonNhatCuoi(vi));
    
            // In ra mảng đã sắp xếp tăng dần
            int[] sortedAsc = sapXepTang(vi);
            System.out.print("Các tờ tiền theo thứ tự tăng dần: ");
            for (int i = 0; i < sortedAsc.length; i++) {
                System.out.print(sortedAsc[i] + " ");
            }
            System.out.println();
    
            // In ra mảng đã sắp xếp giảm dần
            int[] sortedDesc = sapXepGiam(vi);
            System.out.print("Các tờ tiền theo thứ tự giảm dần: ");
            for (int i = 0; i < sortedDesc.length; i++) {
                System.out.print(sortedDesc[i] + " ");
            }
            System.out.println();
    
            // Thống kê số tờ tiền có mệnh giá lớn hơn 50.000
            System.out.println("Số tờ tiền có mệnh giá lớn hơn 50.000: " + thongKe50(vi));
    
            // Thống kê số tờ tiền có mệnh giá nhỏ hơn 100.000
            System.out.println("Số tờ tiền có mệnh giá nhỏ hơn 100.000: " + thongKe100(vi));
        }
    }