function tsAnagram(a: string, b: string): boolean {
  if (a.length !== b.length) {
    return false;
  }

  const aToArray: string[] = a.toLowerCase().split('').sort();
  const bToArray: string[] = b.toLowerCase().split('').sort();

  return aToArray.join('') === bToArray.join('');
}

export default tsAnagram;
