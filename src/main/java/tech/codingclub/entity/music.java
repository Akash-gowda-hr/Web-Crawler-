package tech.codingclub.entity;

public class music {

     String parent_link;
     String link;
     String album;
     String lyricist;
     String music_director;
     String image_url;
     String singers;
     String duration;


     public music(String parent_link, String link, String album, String lyricist, String music_director, String image_url, String singers, String duration) {
          this.parent_link = parent_link;
          this.link = link;
          this.album = album;
          this.lyricist = lyricist;
          this.music_director = music_director;
          this.image_url = image_url;
          this.singers = singers;
          this.duration = duration;
     }

     public music() {
     }



}
