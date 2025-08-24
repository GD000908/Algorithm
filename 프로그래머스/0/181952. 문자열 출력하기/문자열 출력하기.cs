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
            // ===== 여기서부터 실제 프로그램 로직 시작 =====
            
            // 사용자에게 문자열 입력 요청
            Console.Write("");
            
            // 문자열 입력받기
            string inputString = Console.ReadLine();
            
            // 입력받은 문자열 그대로 출력
            Console.WriteLine(inputString);
            
            // 프로그램 종료 전 대기
            //Console.WriteLine("아무 키나 누르면 종료됩니다...");
            //Console.ReadKey();
            
            // ===== 프로그램 로직 끝 =====
        } // Main 메서드 끝
    } // Program 클래스 끝
} // StringInputOutput 네임스페이스 끝