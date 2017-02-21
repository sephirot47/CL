func main()
  write "Testing";
  varArray = [6,4,5,2,1,0,9];
  printArray(1, 5)
endfunc

func printArray(array, size)
	i = 0;
	write "Array: %n";
	while i < size do
		write array[i]; write "%n";
		i = i + 1;
	endwhile;
	write "------%n";
endfunc
