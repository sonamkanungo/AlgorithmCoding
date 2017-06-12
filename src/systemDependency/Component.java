package systemDependency;

import java.util.ArrayList;

/**
 * Created by kanunso on 3/28/17.
 */
public class Component {

    public String cname;

    public ArrayList<Component> depedencies;

    public Component(String cname) {
        this.cname = cname;
    }

}
