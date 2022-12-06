const a = [7, 5, 6, 4, 8, 9, 0, 4, 5, 6, 3, 4, 1];

const descInertionSort = (arr) => {
  for (let i = 1; i < arr.length; i++) {
    const key = arr[i];
    let j = i - 1;
    while (j >= 0 && arr[j] < key) {
      arr[j + 1] = arr[j];
      j = j - 1;
      arr[j + 1] = key;
    }
  }
  console.log(arr);
};

descInertionSort(a);
