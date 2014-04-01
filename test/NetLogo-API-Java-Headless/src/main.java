import org.nlogo.headless.HeadlessWorkspace;

public class main {
  public static void main(String[] argv) {
	System.setProperty("org.nlogo.is3d", "true");
    HeadlessWorkspace workspace = HeadlessWorkspace.newInstance() ;
    try {
    	System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
      workspace.open(
    "ProjetSMA.nlogo3d");
      //workspace.command("set density 62");
     // workspace.command("random-seed 0");
      workspace.command("setup");
      workspace.command("repeat 50 [ go ]") ;
      workspace.command("export-view \"screenshot.jpg\"") ;
      //System.out.println(    workspace.report("burned-trees"));
      workspace.dispose();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}