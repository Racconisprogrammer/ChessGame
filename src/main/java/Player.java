import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Player {

    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;

}
