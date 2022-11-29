#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "calc-func.h"

int usage()
{
	printf("Usage: shit-calc FUNCTION num1 num2\n");
	printf("\t\t where FUNCTION is add, sub, mul, div\n");
	return 0;
}

int main(int argc, char *argv[])
{
	// check number of arguments
	if (argc != 4) {
       		usage();
		return 0;
	}

	int x = atoi(argv[2]);
	int y = atoi(argv[3]);

	// check which function to perform
	if (strcmp(argv[1], "add") == 0) {
		add(x, y);
	}
	else if (strcmp(argv[1], "sub") == 0) {
		sub(x, y);
	}
	else if (strcmp(argv[1], "mul") == 0) {
		mul(x, y);
	}
	else if (strcmp(argv[1], "div") == 0) {
		divide(x, y);
	}
	else {
		usage();
	}

	return 0;
	
}
