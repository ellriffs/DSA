
const insertionSort = (arr) => {
  //initialization - merge sort for sorting in place
  for (let i = 1; i < arr.length; i++) {
    const key = arr[i];
    j = i - 1;
    while (j >= 0 && arr[j] > key) {
      arr[j + 1] = arr[j];
      j = j - 1;
      arr[j + 1] = key;
    }
  }
  console.log(arr);
};

insertionSort(arr);
