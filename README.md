# kotlin-lotto

### Step1. 문자열 덧셈 계산기

##### 기능 요구 사항
1. 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 
   구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
2. 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 
   예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 
   커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
3. 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

##### 요구 사항 정리
 - [x] 빈 문자열 또는 null 을 입력하면 0을 반환한다
 - [x] 숫자 하나를 문자열로 입력하면 해당 숫자를 반환한다
 - [x] 숫자 사이에 입력된 문자열은 구분자
 - [x] 구분자는 , 또는 : 을 사용 할 수 있다
 - [x] "//"와 "\n" 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
 - [x] 음수를 입력하면 RuntimeException 발생한다
 - [ ] 입력된 문자열의 덧셈 결과를 얻을 수 있다