package bingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		List<Character> alphabet = new ArrayList<Character>();
		Set<Character> wordSet = new HashSet<Character>();
		List<Integer> numList = new ArrayList<Integer>();
		int[] numbers = new int[25];
		Random rd = new Random();
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		while(numList.size() != numbers.length) {
			int temp = rd.nextInt(25)+1;
			System.out.println(temp);
			if(!numList.contains(temp)) numList.add(temp);
		}
		
		int index = 0;
		
		for(int i : numList) {
			index++;
			if(index == 5) {
				System.out.println(i);
				index = 0;
			}else {
				System.out.print(i + " ");
			}
		}
		
		System.out.println((int) 'a'); // A 65 Z 90 a  97
		
		for(int i=0; i<26; i++) {
			alphabet.add((char) (i+65));
			alphabet.add((char) (i+97)); 
		}
		
		String world = "가나\r\n" + 
				"가봉\r\n" + 
				"가이아나\r\n" + 
				"감비아\r\n" + 
				"과테말라\r\n" + 
				"그레나다\r\n" + 
				"그리스\r\n" + 
				"기니\r\n" + 
				"기니비사우\r\n" + 
				"나고르노카라바흐 공화국\r\n" + 
				"나미비아\r\n" + 
				"나우루\r\n" + 
				"나이지리아\r\n" + 
				"남수단\r\n" + 
				"남아프리카 공화국\r\n" + 
				"남오세티야\r\n" + 
				"네덜란드\r\n" + 
				"네팔\r\n" + 
				"노르웨이\r\n" + 
				"뉴질랜드\r\n" + 
				"니제르\r\n" + 
				"니카라과\r\n" + 
				"대한민국\r\n" + 
				"덴마크\r\n" + 
				"도미니카\r\n" + 
				"도미니카 공화국\r\n" + 
				"독일\r\n" + 
				"동티모르\r\n" + 
				"라오스\r\n" + 
				"라이베리아\r\n" + 
				"라트비아\r\n" + 
				"러시아\r\n" + 
				"레바논\r\n" + 
				"레소토\r\n" + 
				"루마니아\r\n" + 
				"룩셈부르크\r\n" + 
				"르완다\r\n" + 
				"리비아\r\n" + 
				"리투아니아\r\n" + 
				"리히텐슈타인\r\n" + 
				"마다가스카르\r\n" + 
				"마셜 제도\r\n" + 
				"마케도니아 공화국\r\n" + 
				"말라위\r\n" + 
				"말레이시아\r\n" + 
				"말리\r\n" + 
				"멕시코\r\n" + 
				"모나코\r\n" + 
				"모로코\r\n" + 
				"모리셔스\r\n" + 
				"모리타니\r\n" + 
				"모잠비크\r\n" + 
				"몬테네그로\r\n" + 
				"몰도바\r\n" + 
				"몰디브\r\n" + 
				"몰타\r\n" + 
				"몽골\r\n" + 
				"미국\r\n" + 
				"미얀마\r\n" + 
				"미크로네시아 연방\r\n" + 
				"바누아투\r\n" + 
				"바레인\r\n" + 
				"바베이도스\r\n" + 
				"바티칸 시국\r\n" + 
				"바하마\r\n" + 
				"방글라데시\r\n" + 
				"베냉\r\n" + 
				"베네수엘라\r\n" + 
				"베트남\r\n" + 
				"벨기에\r\n" + 
				"벨라루스\r\n" + 
				"벨리즈\r\n" + 
				"보스니아 헤르체고비나\r\n" + 
				"보츠와나\r\n" + 
				"볼리비아\r\n" + 
				"부룬디\r\n" + 
				"부르키나파소\r\n" + 
				"부탄\r\n" + 
				"북키프로스\r\n" + 
				"불가리아\r\n" + 
				"브라질\r\n" + 
				"브루나이\r\n" + 
				"사모아\r\n" + 
				"사우디아라비아\r\n" + 
				"사하라 아랍 민주 공화국\r\n" + 
				"산마리노\r\n" + 
				"상투메 프린시페\r\n" + 
				"세네갈\r\n" + 
				"세르비아\r\n" + 
				"세이셸\r\n" + 
				"세인트루시아\r\n" + 
				"세인트빈센트 그레나딘\r\n" + 
				"세인트키츠 네비스\r\n" + 
				"소말리아\r\n" + 
				"소말릴란드\r\n" + 
				"솔로몬 제도\r\n" + 
				"수단\r\n" + 
				"수리남\r\n" + 
				"스리랑카\r\n" + 
				"스와질란드\r\n" + 
				"스웨덴\r\n" + 
				"스위스\r\n" + 
				"스페인\r\n" + 
				"슬로바키아\r\n" + 
				"슬로베니아\r\n" + 
				"시리아\r\n" + 
				"시에라리온\r\n" + 
				"싱가포르\r\n" + 
				"아랍에미리트\r\n" + 
				"아르메니아\r\n" + 
				"아르헨티나\r\n" + 
				"아이슬란드\r\n" + 
				"아이티\r\n" + 
				"아일랜드\r\n" + 
				"아제르바이잔\r\n" + 
				"아프가니스탄\r\n" + 
				"안도라\r\n" + 
				"알바니아\r\n" + 
				"알제리\r\n" + 
				"압하스\r\n" + 
				"앙골라\r\n" + 
				"앤티가 바부다\r\n" + 
				"에리트레아\r\n" + 
				"에스토니아\r\n" + 
				"에콰도르\r\n" + 
				"에티오피아\r\n" + 
				"엘살바도르\r\n" + 
				"영국\r\n" + 
				"예멘\r\n" + 
				"오만\r\n" + 
				"오스트레일리아\r\n" + 
				"오스트리아\r\n" + 
				"온두라스\r\n" + 
				"요르단\r\n" + 
				"우간다\r\n" + 
				"우루과이\r\n" + 
				"우즈베키스탄\r\n" + 
				"우크라이나\r\n" + 
				"이라크\r\n" + 
				"이란\r\n" + 
				"이스라엘\r\n" + 
				"이집트\r\n" + 
				"이탈리아\r\n" + 
				"인도\r\n" + 
				"인도네시아\r\n" + 
				"일본\r\n" + 
				"자메이카\r\n" + 
				"잠비아\r\n" + 
				"적도 기니\r\n" + 
				"조선민주주의인민공화국\r\n" + 
				"조지아\r\n" + 
				"중앙아프리카 공화국\r\n" + 
				"중화민국\r\n" + 
				"중화인민공화국\r\n" + 
				"지부티\r\n" + 
				"짐바브웨\r\n" + 
				"차드\r\n" + 
				"체코\r\n" + 
				"칠레\r\n" + 
				"카메룬\r\n" + 
				"카보베르데\r\n" + 
				"카자흐스탄\r\n" + 
				"카타르\r\n" + 
				"캄보디아\r\n" + 
				"캐나다\r\n" + 
				"케냐\r\n" + 
				"코모로\r\n" + 
				"코소보 공화국\r\n" + 
				"코스타리카\r\n" + 
				"코트디부아르\r\n" + 
				"콜롬비아\r\n" + 
				"콩고 공화국\r\n" + 
				"콩고 민주 공화국\r\n" + 
				"쿠바\r\n" + 
				"쿠웨이트\r\n" + 
				"크로아티아\r\n" + 
				"키르기스스탄\r\n" + 
				"키리바시\r\n" + 
				"키프로스\r\n" + 
				"타지키스탄\r\n" + 
				"탄자니아\r\n" + 
				"태국\r\n" + 
				"터키\r\n" + 
				"토고\r\n" + 
				"통가\r\n" + 
				"투르크메니스탄\r\n" + 
				"투발루\r\n" + 
				"튀니지\r\n" + 
				"트란스니스트리아\r\n" + 
				"트리니다드 토바고\r\n" + 
				"파나마\r\n" + 
				"파라과이\r\n" + 
				"파키스탄\r\n" + 
				"파푸아뉴기니\r\n" + 
				"팔라우\r\n" + 
				"팔레스타인\r\n" + 
				"페루\r\n" + 
				"포르투갈\r\n" + 
				"폴란드\r\n" + 
				"프랑스\r\n" + 
				"피지\r\n" + 
				"핀란드\r\n" + 
				"필리핀\r\n" + 
				"헝가리";
		String[] worldName = world.split("\r\n"); 
		
		
		while(set.size() != 25) {
			set.add(worldName[rd.nextInt(worldName.length)]);
		}
		
		/*
		 * Iterator<String> it = set.iterator(); int i=1; while(it.hasNext()) { if(i%5
		 * == 0) { System.out.print(i); i = 0; System.out.println(it.next()); }else {
		 * System.out.print(it.next()+ " "); } i++; }
		 * 
		 * while(wordSet.size() != 25) {
		 * wordSet.add(alphabet.get(rd.nextInt(alphabet.size()))); }
		 * 
		 * Iterator<Character> iter = wordSet.iterator(); i=1; while(iter.hasNext()) {
		 * if(i%5 == 0) { i = 0; System.out.println(iter.next()); }else {
		 * System.out.print(iter.next()+ " "); } i++; }
		 */
		
	}
}