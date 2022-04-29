object Main
{
  def main(args:Array[String])=
  {
    val fin=
    {
      if(args.length>0) args(0).toInt;
      else 100;
    }
    val start=1;
    fizzbuzz(start,fin);
  }
  def fizzbuzz(start:Int,fin:Int):Unit=
  {
    var msg="";
    if(start<fin+1)
    {
      if(start%3==0) msg+="fizz";
      if(start%5==0) msg+="buzz";
      if(msg.length()>0) println(msg);
      else println(start);
      fizzbuzz(start+1,fin);
    }
  }
}
