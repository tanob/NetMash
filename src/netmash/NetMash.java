
package netmash;

import netmash.Version;
import netmash.platform.Kernel;
import netmash.forest.FunctionalObserver;

/**  NetMash: FOREST Reference Implementation; server main.
  */
public class NetMash {

    //-----------------------------------------------------

    static public void main(String[] args){

        System.out.println("-------------------");
        System.out.println(Version.NAME+" "+Version.NUMBERS);

        Kernel.init(new FunctionalObserver());
        Kernel.run();
    }
}

//---------------------------------------------------------

