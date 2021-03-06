package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.singleton.EagerInitializedSingleton;
import io.github.ingloriouscoderz.singleton.InnerClassSingleton;
import io.github.ingloriouscoderz.singleton.LazyInitializedSingleton;
import io.github.ingloriouscoderz.singleton.StaticBlockSingleton;
import io.github.ingloriouscoderz.singleton.ThreadSafeSingleton;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing EagerInitializedSingleton...");
		EagerInitializedSingleton eis1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eis2 = EagerInitializedSingleton.getInstance();
		System.out.println("instance1 hashCode=" + eis1.hashCode());
		System.out.println("instance2 hashCode=" + eis2.hashCode());
		System.out.println("instance1==instance2:" + (eis1==eis2));
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing StaticBlockSingleton...");
		StaticBlockSingleton sbs1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton sbs2 = StaticBlockSingleton.getInstance();
		System.out.println("instance1 hashCode=" + sbs1.hashCode());
		System.out.println("instance2 hashCode=" + sbs2.hashCode());
		System.out.println("instance1==instance2:" + (sbs1==sbs2));
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing LazyInitializedSingleton...");
		LazyInitializedSingleton lis1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lis2 = LazyInitializedSingleton.getInstance();
		System.out.println("instance1 hashCode=" + lis1.hashCode());
		System.out.println("instance2 hashCode=" + lis2.hashCode());
		System.out.println("instance1==instance2:" + (lis1==lis2));

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing ThreadSafeSingleton...");
		ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton tss2 = ThreadSafeSingleton.getInstance();
		System.out.println("instance1 hashCode=" + tss1.hashCode());
		System.out.println("instance2 hashCode=" + tss2.hashCode());
		System.out.println("instance1==instance2:" + (tss1==tss2));

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing InnerClassSingleton (Bill Pugh Singleton Implementation)...");
		InnerClassSingleton ics1 = InnerClassSingleton.getInstance();
		InnerClassSingleton ics2 = InnerClassSingleton.getInstance();
		System.out.println("instance1 hashCode=" + ics1.hashCode());
		System.out.println("instance2 hashCode=" + ics2.hashCode());
		System.out.println("instance1==instance2:" + (ics1==ics2));
}

}
