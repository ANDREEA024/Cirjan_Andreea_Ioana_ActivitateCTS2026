package DP2025.Creationale.Factory.FactoryMethod;

public class FactoryPizzaRoma implements IFactory{

	@Override
	public IPizza crearePizza() {
		return new PizzaRoma();
	}

}
