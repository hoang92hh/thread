Tại mooitj thời điểm (OS)
-Nghe Nhạc -> Tiến trình 1
-Xem Phim - Tiến trình 2
-Chat ->3
Gõ Văn bản -< 4
Lươt Web...-> 5

Máy tính, tại 1 thời điểm -> Máy tính chỉ xỷ lý được 1 dòng lệnh trong một tiến trình
Dựa vào giải thuật toán Round all spin .các tiến trình được xử lý tuần tự (không theo thứ tự) , 
với tốc độ nên cho chúng ta cảm giác nhiều tiến trinh đang được cùng lúc tại một thời điển.
Có nhiều loại giải thuật.


Xây dựng 1 phần mềm (Game) ->1 tiến trình
-Tải file -> Thread 1 đảm nhận 
-nhân vật chuyển động - Thread 2 đảm nhận 
-Chat ->Thread 3
-Nghe nhac của game -> 4
...-> 5
Chương 


Thread 
    + Tìm hieu ve Thread & multithread
    + Hiểu về nó
    -Thực hiện triển khai trong code
    _ Động bộ 2 thread ( 2: java)
    
    
 Cac trang thai cua Thread va Synchonized
 
 -wait , notify, notifyAll ==>run
 
 Bai tap
 -t1, sinh ngau nhien 1 so tu nhien tu 1-100
 t2>> hin thị bình phương số đã được sinh ra từ t1
 1.Tạo 2 Thread  thực hiện yêu câu trên
 2. Đồng bộ luông
 T1 thực hiên> rad > T1 đợi T2> Hiển thị bình phương số rad ở T2> in ra màn hình ở T2> T2 wait > T1 chạy> 
 Vòng trò như trên được thực hiện tuần tự
 3. Sinh ngẫu nhiên 10 số =>> stop 2 luồng.
 
 
 Phân tích
 T1>rad => lưu trữ
 t2> Lấy số rad => hiển thị
 =>> DataMgr => Shared Data
 
 Giai thich
 
 
 T1 > chay toi > synchronized . chiem quyen xử ly dau tien tài nguyên (shared Data)
 T2 > toi synchronized > đợi queue 

T1 >sinh so ngau nhien > shared Data > Hien thi > goi tiếp  sharedData.(notifyAll)
Tuy nhien notifyAll() chỉ đánh thức những sharedData đang ở trang thái wait. sharedData ở T2 vẫn đang chờ ở queue -> chưa có tác động gì cả.
>> T1 tiếp tục đi vào wait theo dòng điều khiển ở threadRandom.
T1 wait --> T2 thoát khỏi queue và bắt đầu thực thi câu lệnh ở ThreadSquare.
T2 chạy tới notifyAll(). -> đánh thức trạng thái wait ở T1 , tuy nhiên T1 chưa được chạy mà lại chờ vào queue,
T2.wait 

notify chỉ đánh thức các data trên chính luồng của nó, không đánh thức các data chung được kiểm soát bởi các luồng khác
notify all đánh thức các data trên tất cả các luồng đang sử dụng tài nguyên data được khai báo, 
tuy nhiên luồng hiện tại vẫn đang kiểm soát và thực thi, các luồng khác được xếp vào queue để chờ cho việc sử dụng data synchonized.

