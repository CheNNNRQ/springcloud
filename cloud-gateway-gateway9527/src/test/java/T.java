import java.time.ZonedDateTime;

/**
 * @author diodi
 * @create 2021-07-13-20:15
 */
public class T {
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2021-02-22T15:51:37.485+08:00[Asia/Shanghai]
    }
}
