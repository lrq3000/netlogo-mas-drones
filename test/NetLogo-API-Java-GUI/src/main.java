import org.nlogo.app.App;
public class main {
  public static void main(String[] argv) {
    App.main(argv);
    try {
      java.awt.EventQueue.invokeAndWait(
    new Runnable() {
      public void run() {
    	  System.setProperty("org.nlogo.is3d", "true");
        try {
          App.app().open("ProjetSMA.nlogo3d");
        }
        catch(java.io.IOException ex) {
          ex.printStackTrace();
        }}});
      App.app().command("set density 62");
      App.app().command("random-seed 0");
      App.app().command("setup");
      App.app().command("repeat 50 [ go ]");
      System.out.println(
    App.app().report("burned-trees"));
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}


/*import org.nlogo.headless.HeadlessWorkspace;

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
      workspace.command("play-mode");
      workspace.command("follow one-of convois");
      workspace.command("repeat 500 [ play-mode-go  ]") ;
      workspace.command("export-view \"screenshot.jpg\"") ;
      //System.out.println(    workspace.report("burned-trees"));
      workspace.dispose();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}*/