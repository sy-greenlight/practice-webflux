package com.example.demo.post;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPostGenerator {

    private static final String[] TITLES = {
            "새로운 시작: 2025년 목표 설정하기",
            "AI와 인간의 공존: 미래 사회 전망",
            "건강한 생활을 위한 10가지 팁",
            "세계 여행 계획: 꼭 가봐야 할 명소 TOP 5",
            "재택근무의 장단점과 효율적인 관리 방법",
            "기후 변화에 대처하는 일상 속 작은 실천",
            "디지털 디톡스의 필요성과 방법",
            "최신 기술 트렌드: 2025년 주목해야 할 5가지",
            "효과적인 시간 관리를 위한 생산성 앱 추천",
            "미니멀리즘: 단순한 삶이 주는 행복"
    };

    private static final String[] CONTENTS = {
            "새해를 맞아 구체적이고 실현 가능한 목표를 세워보세요. 작은 변화로 큰 성과를 이룰 수 있습니다.",
            "AI 기술의 발전으로 인한 사회 변화와 그에 따른 윤리적 문제들을 살펴봅니다.",
            "균형 잡힌 식단, 규칙적인 운동, 충분한 수면 등 건강한 삶을 위한 실천 방법을 소개합니다.",
            "세계 각국의 문화와 역사를 체험할 수 있는 필수 여행지들을 소개합니다.",
            "재택근무의 장단점을 분석하고, 효율적인 업무 수행을 위한 팁을 제공합니다.",
            "일상 생활 속에서 실천할 수 있는 환경 보호 방법들을 소개합니다.",
            "디지털 기기 사용을 줄이고 현실 세계와 연결되는 방법에 대해 이야기합니다.",
            "AI, 블록체인, 메타버스 등 주목받는 기술들의 최신 동향을 살펴봅니다.",
            "시간 관리와 생산성 향상에 도움을 주는 다양한 앱들을 소개하고 비교합니다.",
            "물건을 줄이고 본질에 집중하는 미니멀 라이프스타일의 장점과 시작 방법을 알아봅니다."
    };

    public static Post generate(long id) {
        int index = ThreadLocalRandom.current().nextInt(TITLES.length);
        LocalDateTime now = LocalDateTime.now();

        return new Post(
                id,
                TITLES[index],
                CONTENTS[index],
                now.minusDays(ThreadLocalRandom.current().nextInt(10, 30)),
                now.minusDays(ThreadLocalRandom.current().nextInt(1, 5))
        );
    }
}
