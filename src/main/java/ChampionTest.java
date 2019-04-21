import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ChampionTest {

    private List<Champion> championList = new ArrayList<Champion>();

    @Before
    public void setUp(){

        //5개의 챔피언 객체를 만듭니다.
        Champion topChamp = new Champion("다리우스","탑");
        Champion jungleChamp = new Champion("리신","정글");
        Champion midChamp = new Champion("르블랑","미드");
        Champion adcChamp = new Champion("베인", "바텀");
        Champion supportChamp = new Champion("레오나", "바텀");

        //앞서 만든 List 에 각 챔피언을 추가합니다.
        championList.add(topChamp);
        championList.add(jungleChamp);
        championList.add(midChamp);
        championList.add(adcChamp);
        championList.add(supportChamp);
    }

    @Test
    public void givenCollectionWhenEmptyCorrect(){
        List<String> emptyList = new ArrayList<String>();
        assertThat(emptyList, empty());
    }

    @Test
    public void notNullCheck(){
        String lck = "LCK";
        assertThat(lck, notNullValue());
    }

    @Test
    public void 부동소수점체크(){
        assertThat(3.14, closeTo(3, 0.2));
    }

    //의미 없어 보이는 테스트 일 수 있으나 에러가 발생하게 되면 테스트 FAil
    //2아닌 5 이상의 값을 참조할 경우에는 에러가 발생
    @Test
    public void shouldNotErrorGetReference(){
        assertThat(championList.get(2), anything());
    }



}