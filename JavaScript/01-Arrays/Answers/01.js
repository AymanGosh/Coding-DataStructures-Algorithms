const reverse0 = function (str) {
  const strArray = str.split(""); // Convert string to array
  const strLength = strArray.length;

  for (let i = 0; i < strLength / 2; i++) {
    let ch = strArray[i];
    strArray[i] = strArray[strLength - 1 - i];
    strArray[strLength - 1 - i] = ch;
  }

  return strArray.join(""); // Convert array back to string
};

function reverse(str) {
  if (!str || typeof str != "string" || str.length < 2) return str;

  const backwards = [];
  const totalItems = str.length - 1;
  for (let i = totalItems; i >= 0; i--) {
    backwards.push(str[i]);
  }
  return backwards.join("");
}

function reverse2(str) {
  //check for valid input
  return str.split("").reverse().join("");
}

const reverse3 = (str) => [...str].reverse().join("");

console.log(reverse0("1234")); // Outputs: "4321"
