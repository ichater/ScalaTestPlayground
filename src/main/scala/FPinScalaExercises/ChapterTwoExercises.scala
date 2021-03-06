package FPinScalaExercises

object ChapterTwoExercises {

  def fib(n:Int):Int ={
    def loop(n:Int, prev: Int, cur:Int):Int= {
      if(n==0) prev
      else loop(n-1,cur,prev+cur)
      loop(n,0,1)
    }
  }

  /**Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function:*/

 def isSorted[A](as:Array[A], gt: (A,A)=>Boolean):Boolean ={
   def go(n:Int): Boolean=
     if(n-1 == as.length)true
     else if(gt(as(n), as(n+1))) false
     else go(n+1)

   go(0)
 }

/**  Let’s look at another example, currying,
9
 which converts a function f of two arguments
into a function of one argument that partially applies f. Here again there’s only one
implementation that compiles. Write this implementation.
 */

  def curry[A,B,C](f: (A,B)=>C):A=>(B => C) = a => b=> f(a,b)

  /**
  Implement uncurry, which reverses the transformation of curry. Note that since =>
  associates to the right, A => (B => C) can be written as A => B => C.
*/
  def uncurry[A,B,C](f: A => B => C): (A, B) => C = (a,b)=> f(a)(b)

  /**
  Implement the higher-order function that composes two functions.
  */
  def compose[A,B,C](f: B => C, g: A => B): A => C = a => f(g(a))
}
