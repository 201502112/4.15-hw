import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data //lombok이 getter/setter 자동 생성해줌
public class Champion {
    private String name;
    private String position;
}