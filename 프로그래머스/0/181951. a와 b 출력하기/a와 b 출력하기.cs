// System 네임스페이스를 가져옴 (Console 클래스 사용을 위해 필수)
using System;

// 네임스페이스: 코드를 그룹화하는 컨테이너 (프로젝트 이름과 같게 하는 것이 일반적)
namespace StringInputOutput
{
    // 클래스: C#의 모든 코드는 클래스 안에 작성되어야 함
    class Program
    {
        // Main 메서드: 프로그램이 실행될 때 가장 먼저 호출되는 진입점 (반드시 필요!)
        // static: 객체를 생성하지 않고도 호출 가능
        // void: 반환값이 없음
        // string[] args: 명령줄에서 전달받는 인수들
        static void Main(string[] args)
        {
            //Console.WriteLine("=== 방법 1: 공백으로 구분해서 입력 ===");
            Console.Write("");
            
            string input = Console.ReadLine();  // "10 20" 형태로 입력받음
            string[] numbers = input.Split(' '); // 공백을 기준으로 문자열을 나눔
            
            // 문자열을 정수로 변환
            int num1 = int.Parse(numbers[0]);  // 첫 번째 숫자
            int num2 = int.Parse(numbers[1]);  // 두 번째 숫자


            Console.WriteLine("a = " + num1);
            Console.WriteLine("b = " + num2);

            
            
        } 
    } 
} 