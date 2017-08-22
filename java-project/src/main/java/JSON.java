// { autofold
import com.google.gson.Gson;

public class JSON {

public static void main(String[] args) throws Exception {
// }

User user = new User("Bob", 123);

String json = new Gson().toJson(user);

System.out.println(json);

// { autofold
}

}
// }
