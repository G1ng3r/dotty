import scala.quoted.*

trait Quoted {
  def foo: Int
}
inline def quote: Quoted = ${ quoteImpl }

def quoteImpl(using Quotes): Expr[Quoted] = '{
  new Quoted {
    def foo = ???
  }
}
