package Cau3;

public class VanBan {
    private String content;
    public VanBan(){

    }

    public VanBan(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String vietHoa(){
        String text=content.toUpperCase();
        return text;
    }
    public String vietThuong(){
        String text=content.toLowerCase();
        return text;
    }
    public String chuanHoa(){
        String text=content.trim().replaceAll("\\s+"," ");
        return text;
    }
    public long demSoTu(){
        StringBuffer buffer = new StringBuffer(content);
        long size=0;
        for (int i = 0; i < buffer.length(); i++) {
            if(buffer.charAt(i)==' '&&buffer.charAt(i+1)!=' ')
            {
                size++;
            }
        }
        return size;
    }
    public String vietHoaChuCaiDauTien(){
        content=vietThuong();
        StringBuffer buffer=new StringBuffer(content);
        buffer.setCharAt(0,Character.toUpperCase(buffer.charAt(0)));
        for (int i = 0; i < buffer.length(); i++) {
            if(buffer.charAt(i)==' '&&buffer.charAt(i+1)!=' '){
                buffer.setCharAt(i+1,Character.toUpperCase(buffer.charAt(i+1)));
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return "VanBan[" +
                "content='" + content + '\'' +
                ']';
    }
}
