package template;

public abstract class PageTemplate {
   private void showLogo(){
       System.out.println("Logo");
   }
   private void showHeader(){
       System.out.println("Tao la header day");
   }
   private void showFooter(){
       System.out.println("Tao la footer day");
   }

   public abstract void showBody();

   public final void showPage(){
       showLogo();
       showHeader();
       showBody();
       showFooter();
   }
}
