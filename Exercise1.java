interface document extends Cloneable {
 document clone();
 void modify();
 
 }

class articleDocument implements document {
 @Override
 public document clone() {
 return new articleDocument();
 }
 @Override
 public void modify() {
    System.out.println("Modifying article document..."); 
 }
 }


 class brochureDocument implements document {
 @Override
 public document clone() {
 return new brochureDocument();
 }
 @Override
 public void modify() {
    System.out.println("Modifying brochure document..."); 
 }
 }



  class reportDocument implements document {
 @Override
 public document clone() {
 return new reportDocument();
 }
 @Override
 public void modify() {
    System.out.println("Modifying report document..."); 
 }
 }
 
 public class Exercise1 {
 public static void main(String[] args) {
 document report = new reportDocument();

 document myReport = report.clone();
 myReport.modify();

 document brochure = new brochureDocument();

 document myBrochure = brochure.clone();
 myBrochure.modify();

 document article = new articleDocument();

 document myArticle = article.clone();
 myArticle.modify();

 }
 }

 // dont forget the class diagrams