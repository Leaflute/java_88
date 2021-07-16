package ch09;

public class _09_GenericPrinter<T> {	// <_09_Powder>
	private T material;	// T 자료형 변수	// private _09_Powder material;
	
	public void setMaterial(T material) {	// _09_Powder material
		this.material = material;
	}
	
	public T getMaterial() {	// _09_Powder getMaterial
		return material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}
