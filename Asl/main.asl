func main()
  write "Testing%n";
  varArray = [true, 4, 5, false, [5,2,3, [1,2,3, [3,4,5, false], true]], true, 3];
  size = 7;
  test(varArray, 7);
  test(varArray, 3)
endfunc

func test(array, size)
  i = -1;
  write "Array: %n";
  while (i < size) do
  write array[ i ]; write "%n";
  i = i + 1;
  endwhile;
  write "------%n";
endfunc