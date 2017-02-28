func main()
  write "Testing";
  varArray = [true, 4, 5, false, [5,2,3], true, 3];
  i = -1;
  size = 7;
  //varArray[2+2] = varArray[1] + 99;
  write "Array: %n";
  while (i < size) do
	write varArray[ i ]; write "%n";
	i = i + 1;
  endwhile;
  write "------%n";
endfunc
