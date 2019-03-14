/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy1;

/**
 *
 * @author user
 */
public class ProxyProject implements Project{
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
     
    }

    @Override
    public void run() {
         //To change body of generated methods, choose Tools | Templates.
         if (realProject==null) {
             realProject = new RealProject(url);
            
        }
         realProject.run();
    }
    
}
