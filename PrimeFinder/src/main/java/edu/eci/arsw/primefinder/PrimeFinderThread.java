package edu.eci.arsw.primefinder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinderThread extends Thread{


	int a,b;
	private ArrayList<Integer> numerosPrimos;

	private List<Integer> primes=new LinkedList<Integer>();
	private int quantityprimes;

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getQuantityprimes() {
		return quantityprimes;
	}

	public PrimeFinderThread(int a, int b, ArrayList<Integer> numerosPrimos) {
		super();
		this.a = a;
		this.b = b;
		this.quantityprimes=0;


	}

	public void run(){
		for (int i=a;i<=b;i++){
			if (isPrime(i)){
				primes.add(i);
				System.out.println(i);
			}
		}


	}
	public void print(){
		for(int i=0;i<numerosPrimos.size();i++)
		{
			System.out.println(numerosPrimos.get(i));
		}
	}

	boolean isPrime(int n) {
		if (n%2==0) return false;
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		quantityprimes+=1;

		return true;
	}


	public ArrayList<Integer> getPrimes() {
		return numerosPrimos;
	}




}
