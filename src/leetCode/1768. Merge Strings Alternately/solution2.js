/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */


var mergeAlternately = function(word1, word2) {
  //출력할 결과 변수
  let result = "";

  // 최대 단어 길이
  let maxIdx;

  if (word1.length > word2.length) {
    maxIdx = word1.length;
  } else {
    maxIdx = word2.length;
  }

  // 각 단어를 한 글자씩 꺼낸다.
  for (let index = 0; index < maxIdx; index++) {
    result += word1.charAt(index);
    result += word2.charAt(index);
  }

  return result;
};

word1 = "ab", word2 = "pqrs"
console.log(mergeAlternately(word1, word2));