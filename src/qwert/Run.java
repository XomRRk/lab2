package qwert;

public interface Run {
   default int run() {
   return 1;
   }
   default    int  jump(){
   return 1;
   }
   default    String  name(){
      return "name";
   }
}
