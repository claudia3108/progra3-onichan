
//le falta una referencia a la biblioteca matematicas a pesar del using...
//debemos referenciarlaaa mediante una referencia de proyecto escribiendo en el cmd..
namespace Principales{
using Matematicas;
	class Principal{
		public static void Main(){
			Operacion op = new Operacion();
			Console.WriteLine(op.Sumar(1000,67));
			Console.WriteLine(op.Restar(1000,600));
			Console.WriteLine(op.Multiplicar(10,5));
		}
	}
}
