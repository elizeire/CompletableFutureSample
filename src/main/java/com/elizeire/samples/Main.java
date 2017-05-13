package com.elizeire.samples;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Start --------");
		
		CompletableFuture.supplyAsync(FakeHeavyStuffService::processAllHevyStuff).thenAccept(System.out::println);
		
		System.out.println("End ----------");
		
		
		System.in.read();
	}

}
