function fizzBuzz(n: number): string[] {
  const result: string[] = [];

  for (let index = 1; index <= n; index += 1) {
    if (index % 15 === 0) {
      result.push('FizzBuzz');
    } else if (index % 5 === 0) {
      result.push('Buzz');
    } else if (index % 3 === 0) {
      result.push('Fizz');
    } else {
      result.push(index.toString());
    }
  }

  return result;
}

export default fizzBuzz;
