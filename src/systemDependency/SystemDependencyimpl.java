package systemDependency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 * Created by kanunso on 3/28/17.
 */
public class SystemDependencyimpl {

    HashMap<String, Component> dmap = new HashMap<String, Component>();

    HashMap<String, Component> currentComponent = new HashMap<String, Component>();

    HashMap<String, Component> installedComponent = new HashMap<String, Component>();


    public void DEPEND(String com , String ... deps){

        if(currentComponent.containsKey(com)){
            System.out.println("Component dependency defined");

        }else{
            Component c = new Component(com);
            ArrayList<Component> dependencies = new ArrayList<Component>();
            for(String d : deps){
                if(currentComponent.containsKey(d)){
                    dependencies.add(currentComponent.get(d));
                }else{
                    Component dc = new Component(d);
                    currentComponent.put(d,dc);
                    dependencies.add(dc);

                }
            }
            c.depedencies = dependencies;
            dmap.put(com, c);// later on

        }
    }


    public void LIST(){
        Set<String> current = currentComponent.keySet();
        for(String s : current){
            System.out.print(s + ", ");
        }

    }


    public void INSTALL(String com){
        if(!installedComponent.containsKey(com)){


        }else{
            System.out.println("Already installed");
        }
    }

    public void REMOVE(String com){
        if(currentComponent.containsKey(com)){
            //get the object
            // check if it has any component that depend on it
            // if yes dont sdo anything

            // else// check if its dependencies are used by other component
                        // yes  -> leave them as it is
                        // NO -> delete from installed and current component

        }else{
            System.out.println(com + "Not Installed ");
        }

    }
}
