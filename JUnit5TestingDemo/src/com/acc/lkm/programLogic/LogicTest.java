package com.acc.lkm.programLogic;

public class LogicTest {
public static int findMax(int arr[]) {
	int max=0;
	//int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if (max<arr[i])
			max=arr[i];
	}
	return max;
}
}
