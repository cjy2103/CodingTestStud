import java.util.*;
public class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreCounts = new HashMap<>(); // 장르별 재생 횟수 누적을 저장하는 맵
        Map<String, List<Song>> genreSongs = new HashMap<>(); // 장르별 곡 리스트를 저장하는 맵

        // 장르별 재생 횟수와 곡 리스트를 맵에 저장
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int playCount = plays[i];

            genreCounts.put(genre, genreCounts.getOrDefault(genre, 0) + playCount);

            List<Song> songList = genreSongs.getOrDefault(genre, new ArrayList<>());

            songList.add(new Song(i, playCount));
            genreSongs.put(genre, songList);
        }

        // 장르별 재생 횟수를 내림차순으로 정렬
        List<String> sortedGenres = new ArrayList<>(genreCounts.keySet());
        Collections.sort(sortedGenres, (a, b) -> genreCounts.get(b) - genreCounts.get(a));

        List<Integer> bestAlbum = new ArrayList<>(); // 베스트 앨범에 수록된 곡의 고유 번호를 저장하는 리스트

        // 장르별로 노래 리스트를 순회하면서 베스트 앨범에 추가
        for (String genre : sortedGenres) {
            List<Song> songList = genreSongs.get(genre);

            // 재생 횟수 내림차순, 고유 번호 오름차순으로 정렬
            Collections.sort(songList, (a, b) -> {
                if (a.playCount == b.playCount) {
                    return a.index - b.index;
                }
                return b.playCount - a.playCount;
            });

            // 베스트 앨범에 곡 추가 (최대 2개)
            int count = 0;
            for (Song song : songList) {
                bestAlbum.add(song.index);
                count++;
                if (count >= 2) {
                    break;
                }
            }
        }

        // 베스트 앨범에 추가된 고유 번호를 배열로 변환하여 반환
        int[] answer = new int[bestAlbum.size()];
        for (int i = 0; i < bestAlbum.size(); i++) {
            answer[i] = bestAlbum.get(i);
        }

        return answer;
    }

    // 곡을 나타내는 클래스
    class Song {
        int index; // 고유 번호
        int playCount; // 재생 횟수

        public Song(int index, int playCount) {
            this.index = index;
            this.playCount = playCount;
        }
    }
}
