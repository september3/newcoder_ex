package collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunlele
 * @className User
 * @date 2019/7/4 22:45
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;

    private int age;
}
