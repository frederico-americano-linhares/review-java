package com.preply.weektwo;

public class QuadraticEquation {

	private double coefficientA;
	private double coefficientB;
	private double coefficientC;

	public QuadraticEquation() {
	}

	public QuadraticEquation(double coefficientA, double coefficientB, double coefficientC) {
		super();
		this.coefficientA = coefficientA;
		this.coefficientB = coefficientB;
		this.coefficientC = coefficientC;
	}

	public double getCoefficientA() {
		return coefficientA;
	}

	public void setCoefficientA(double coefficientA) {
		this.coefficientA = coefficientA;
	}

	public double getCoefficientB() {
		return coefficientB;
	}

	public void setCoefficientB(double coefficientB) {
		this.coefficientB = coefficientB;
	}

	public double getCoefficientC() {
		return coefficientC;
	}

	public void setCoefficientC(double coefficientC) {
		this.coefficientC = coefficientC;
	}

	public double discriminant() {

		return (this.coefficientB)*(this.coefficientB) - 4*(this.coefficientA)*(this.coefficientC); 

	}
	
	public String realRoots() {

		Double zero = 0d;
		Double discriminant = this.discriminant();
		
		if (Double.compare(zero,discriminant) == 0) {			
		 return "The root is " + calculateRealRoot(discriminant)[0];			
		}
		if (Double.compare(zero,discriminant) < 0) {			
		 return "The roots are " + calculateRealRoot(discriminant)[0] + " and " + calculateRealRoot(discriminant)[1] ;
		}
		 return "The equation does not have real roots.";		
	}

	private double[] calculateRealRoot(Double discriminant) {
		
		double[] roots = new double[2];
		
		roots[0] =  ((-this.coefficientB)  - Math.sqrt(discriminant))/ (2*this.coefficientA);
		roots[1] =  ((-this.coefficientB)  + Math.sqrt(discriminant))/ (2*this.coefficientA);
		
		return roots;
	}
}
