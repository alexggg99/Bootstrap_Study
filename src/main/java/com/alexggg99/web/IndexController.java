package com.alexggg99.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/menu")
    public String replay(){
        return "menu";
    }

    @RequestMapping(value = "/typography")
    public String typography() {
        return "typography";
    }

    @RequestMapping("/json/movies.json")
    @ResponseBody
    public String json(){

        String str1 = "[\n" +
                "  {\n" +
                "    \"title\": \"Manos: The Hands of Fate\",\n" +
                "    \"id\": 22293,\n" +
                "    \"original_title\": \"Manos: The Hands of Fate\",\n" +
                "    \"overview\": \"A family gets lost on the road and stumbles upon a hidden, underground, devil-worshiping cult led by the fearsome Master and his servant Torgo.\",\n" +
                "    \"poster_path\": \"/tZaonBg32xu7LaGdE95q2rBHNcd.jpg\",\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/2adnwo8EzPd3mOlf5Ays60ttbag.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 19000,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 9648,\n" +
                "        \"name\": \"Mystery\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"imdb_id\": \"tt0060666\",\n" +
                "    \"popularity\": 0.000752848537300049,\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Norm-Iris\",\n" +
                "        \"id\": 4067\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1966-11-15\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 74,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"It's Shocking! It's Beyond Your Imagination!\",\n" +
                "    \"vote_average\": 2.2,\n" +
                "    \"vote_count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/zpjQ0DwpqRa7dXKLidr2fG2wGfT.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 37,\n" +
                "        \"name\": \"Western\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 22613,\n" +
                "    \"imdb_id\": \"tt0036241\",\n" +
                "    \"original_title\": \"The Outlaw\",\n" +
                "    \"overview\": \"Newly appointed sheriff Pat Garrett is pleased when his old friend Doc Holliday arrives in Lincoln, New Mexico on the stage. Doc is trailing his stolen horse, and it is discovered in the possession of Billy the Kid. In a surprising turnaround, Billy and Doc become friends. This causes the friendship between Doc and Pat to cool. The odd relationship between Doc and Billy grows stranger when Doc hides Billy at his girl, Rio's, place after Billy is shot.\",\n" +
                "    \"popularity\": 0.0236765308122955,\n" +
                "    \"poster_path\": \"/9xuhI0b5rlmH08dIyCxvM0Ym7It.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Howard Hughes Productions\",\n" +
                "        \"id\": 12258\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1943-02-05\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 116,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_639_1\": \"es\",\n" +
                "        \"name\": \"EspaГѓВ±ol\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Tall.... Terrific.... and Trouble!\",\n" +
                "    \"title\": \"The Outlaw\",\n" +
                "    \"vote_average\": 5.8,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/map0hBXdOi0bHEjagfb13vTUy9r.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 9648,\n" +
                "        \"name\": \"Mystery\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10753,\n" +
                "        \"name\": \"Film Noir\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 20246,\n" +
                "    \"imdb_id\": \"tt0038991\",\n" +
                "    \"original_title\": \"The Stranger\",\n" +
                "    \"overview\": \"Orson Welles plays an escaped Nazi war criminal. After the war, he fled to the United States and assumed the name of Charles Rankin. Engaged to the unsuspecting daughter of a Chief Justice of the Supreme Court and posing as a college professor, he had the perfect cover. No one would think to look for a notorious Nazi war criminal in the sacred precincts of the Harper's School...\",\n" +
                "    \"popularity\": 0.232625856735256,\n" +
                "    \"poster_path\": \"/dA4FkGMiDBW0weZ1sPHmOUDMEiD.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"International Pictures (I)\",\n" +
                "        \"id\": 4995\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1946-05-25\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 96,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The Most Deceitful Man A Woman Ever Loved !\",\n" +
                "    \"title\": \"The Stranger\",\n" +
                "    \"vote_average\": 7.5,\n" +
                "    \"vote_count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/tG8tBUvTweYLEgZxLpTJ60nOxBc.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"Fantasy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 31655,\n" +
                "    \"imdb_id\": \"tt0057569\",\n" +
                "    \"original_title\": \"The Terror\",\n" +
                "    \"overview\": \"Lieutenant Andre Duvalier has been accidentally separated from his regiment. He is wandering near the coast when he sees a young woman. He asks the road to Coldon, where he hopes to rejoin his regiment. But the woman doesn't answer, doesn't even greet him and walks away. Eventually she takes him to the sea, where she disappears in rough water. How can he save the mysterious girl?\",\n" +
                "    \"popularity\": 0.104048931317393,\n" +
                "    \"poster_path\": \"/lgZlmzKbHkaP2H1LzaNfJDyfqDE.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"the filmgroup\",\n" +
                "        \"id\": 13733\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"American International Pictures (AIP)\",\n" +
                "        \"id\": 9266\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1963-06-17\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 81,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Who is The Terror?\",\n" +
                "    \"title\": \"The Terror\",\n" +
                "    \"vote_average\": 6.3,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/49MhLMdQmVVsvqItcWKh9FZdOW0.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 41023,\n" +
                "    \"imdb_id\": \"tt0035784\",\n" +
                "    \"original_title\": \"Dead Men Walk\",\n" +
                "    \"overview\": \"We meet Doctor Lloyd Clayton at the funeral of his twin brother, evil magician Elwyn. Zolarr, Elwyn's hunchbacked servant, acccuses Lloyd of Elwyn's murder, but Lloyd claims it was self-defense. Lloyd's niece Gayle and her fiance Harper soon find that Elwyn's evil influence is still at work.\",\n" +
                "    \"popularity\": 0.00223673101025987,\n" +
                "    \"poster_path\": \"/6IPHzqg50sGd9BUkH9y15UsncZS.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Producers Releasing Corporation\",\n" +
                "        \"id\": 3759\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1943-04-12\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 64,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Devil's sorcery, as a dead man returns for vengeance!\",\n" +
                "    \"title\": \"Dead Men Walk\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/jmjrl4gcyPlJ6sIi88qX0UUqtLs.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 100000,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 37833,\n" +
                "    \"imdb_id\": \"tt0028346\",\n" +
                "    \"original_title\": \"Tell Your Children\",\n" +
                "    \"overview\": \"This 1930's cult classic shows in a fun and comical way how marijuana is\\\" public enemy No. 1.\\\" With just a little toke, average teenagers become addicted, turning into psycho killers and brazen hussies.\",\n" +
                "    \"popularity\": 0.0651628477008911,\n" +
                "    \"poster_path\": \"/6K6ZYzVjqNUVYZag26aaVScCX4h.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"George A. Hirliman Productions\",\n" +
                "        \"id\": 10748\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1936-01-15\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 68,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"SEE youthful marijuana victims - what actually happens!\",\n" +
                "    \"title\": \"Reefer Madness\",\n" +
                "    \"vote_average\": 6.1,\n" +
                "    \"vote_count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 66000,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 80,\n" +
                "        \"name\": \"Crime\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 1115,\n" +
                "        \"name\": \"Road Movie\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 20174,\n" +
                "    \"imdb_id\": \"tt0046969\",\n" +
                "    \"original_title\": \"The Fast and the Furious\",\n" +
                "    \"overview\": \"A man wrongly imprisoned for murder breaks out of jail. He wants to clear his name, but with the police pursuing him...\",\n" +
                "    \"popularity\": 0.00167562432298208,\n" +
                "    \"poster_path\": \"/twWJWolTI0UN1DxsmK6pnf14E5D.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Palo Alto Productions\",\n" +
                "        \"id\": 3733\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1955-02-15\",\n" +
                "    \"revenue\": 250000,\n" +
                "    \"runtime\": 73,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"The Fast and the Furious\",\n" +
                "    \"vote_average\": 2.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/i6sv0ZiLcBbB656VTh7PKyILbc0.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 2916,\n" +
                "        \"name\": \"Erotic\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10756,\n" +
                "        \"name\": \"Indie\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 27084,\n" +
                "    \"imdb_id\": \"tt0070222\",\n" +
                "    \"original_title\": \"Invasion of the Bee Girls\",\n" +
                "    \"overview\": \"Neil Agar, a security agent with the State Department, is dispatched to Peckham, California to investigate the death of a bacteriologist working at government-sponsored Brandt Research. His investigation is soon complicated by a growing number of deaths, all men who died of congestive heart failure caused by sexual exhaustion.\",\n" +
                "    \"popularity\": 0.0112480260361523,\n" +
                "    \"poster_path\": \"/wCGVmyoiGLFHsH6SrQt3vITSPRQ.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Sequoia Pictures\",\n" +
                "        \"id\": 4629\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1973-06-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 85,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"They'll Love The Very Life Out Of Your Body!\",\n" +
                "    \"title\": \"Invasion of the Bee Girls\",\n" +
                "    \"vote_average\": 2.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/peokPSleNYhA9ASHcCPJGAz806I.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 200000,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"Fantasy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10751,\n" +
                "        \"name\": \"Family\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 32307,\n" +
                "    \"imdb_id\": \"tt0058548\",\n" +
                "    \"original_title\": \"Santa Claus Conquers the Martians\",\n" +
                "    \"overview\": \"Martians, upset that their children have become obsessed with TV shows from Earth which extol the virtues of Santa Claus, start an expedition to Earth to kidnap the one and only Santa. While on Earth, they kidnap two lively children that lead the group of Martians to the North Pole and Santa. The Martians then take Santa and the two children back to Mars with them. Voldar, a particularly grumpy Martian, attempts to do away with the children and Santa before they get to Mars, but their leader Lomas stops him. When they arrive on Mars, Santa, with the help of the two Earth children and a rather simple-minded Martian lackey, overcomes the Martians by bringing fun, happiness and Christmas cheer to the children of Mars.\",\n" +
                "    \"popularity\": 0.000427522680594302,\n" +
                "    \"poster_path\": \"/rUTSCkPAuRNyILkfnfiQoS4BSKz.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1964-11-14\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 81,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Santa Claus Conquers the Martians\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/zmRWZ6nRPa95JNuatwMAVVzZzSt.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 13553,\n" +
                "    \"imdb_id\": \"tt0079082\",\n" +
                "    \"original_title\": \"The Driller Killer\",\n" +
                "    \"overview\": \"An artist slowly goes insane while struggling to pay his bills, work on his paintings, and care for his two female roommates, which leads him taking to the streets of New York after dark and randomly killing derelicts with a power drill.\",\n" +
                "    \"popularity\": 0.078485600780542,\n" +
                "    \"poster_path\": \"/zInRReEwJZTh4meVVuFJqQeWF4V.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Navaron Productions\",\n" +
                "        \"id\": 2766\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1979-06-15\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 96,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The Blood Runs In Rivers... And The Drill Keeps Tearing Through Flesh And Bone.\",\n" +
                "    \"title\": \"The Driller Killer\",\n" +
                "    \"vote_average\": 4.3,\n" +
                "    \"vote_count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/uRz6KgauShQ0HOESoJnOhLp5Wkh.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 9648,\n" +
                "        \"name\": \"Mystery\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10748,\n" +
                "        \"name\": \"Suspense\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 35813,\n" +
                "    \"imdb_id\": \"tt0052602\",\n" +
                "    \"original_title\": \"The Bat\",\n" +
                "    \"overview\": \"Mystery writer Cornelia Van Gorder has rented a country house called \\\"The Oaks\\\", which not long ago had been the scene of some murders committed by a strange and violent criminal known as \\\"The Bat\\\".Meanwhile, the house's owner, bank president John Fleming, has recently embezzled one million dollars in securities, and has hidden the proceeds in the house, but he is killed before he can retrieve it.\",\n" +
                "    \"popularity\": 0.0280369306430792,\n" +
                "    \"poster_path\": \"/kuqbKnzULGFDZEBrOjQooBray5w.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Liberty Pictures\",\n" +
                "        \"id\": 20938\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1959-08-09\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 80,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"When Someone SCREAMS ... It Will Be YOU!\",\n" +
                "    \"title\": \"The Bat\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": {\n" +
                "      \"id\": 124930,\n" +
                "      \"name\": \"King of the Zombies Collection\",\n" +
                "      \"poster_path\": null,\n" +
                "      \"backdrop_path\": null\n" +
                "    },\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23104,\n" +
                "    \"imdb_id\": \"tt0033787\",\n" +
                "    \"original_title\": \"King of the Zombies\",\n" +
                "    \"overview\": \"During World War II, a small plane somewhere over the Caribbean runs low on fuel and is blown off course by a storm. Guided by a faint radio signal, they crash-land on an island. The passenger, his manservant and the pilot take refuge in a mansion owned by a doctor. The quick-witted yet easily-frightened manservant soon becomes convinced the mansion is haunted by zombies and ghosts.\",\n" +
                "    \"popularity\": 0.00110022854656597,\n" +
                "    \"poster_path\": \"/3RJJvAyeDQ9mAgMngM9L1dzRlPH.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Monogram Pictures\",\n" +
                "        \"id\": 4395\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1941-05-14\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 67,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"HUMAN SACRIFICES! SAVAGE TORTURE! VOODOO RITES!\",\n" +
                "    \"title\": \"King of the Zombies\",\n" +
                "    \"vote_average\": 4.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10749,\n" +
                "        \"name\": \"Romance\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 62768,\n" +
                "    \"imdb_id\": \"tt0091065\",\n" +
                "    \"original_title\": \"Flying\",\n" +
                "    \"overview\": \"TV-generation feel good story about a teenage gymnast aiming for the championship despite an abusive stepfather, an ailing mother, and injury. Reeves is notable as the supportive boyfriend.\",\n" +
                "    \"popularity\": 0.147194605834639,\n" +
                "    \"poster_path\": \"/6fUKBijtTSUvhIDhJECSDblXCe0.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Flying Pictures Productions\",\n" +
                "        \"id\": 24442\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Golden Harvest Company\",\n" +
                "        \"id\": 2521\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Brightstar Films\",\n" +
                "        \"id\": 4923\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"CA\",\n" +
                "        \"name\": \"Canada\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1986-05-14\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 96,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"...All things are possible\",\n" +
                "    \"title\": \"Flying\",\n" +
                "    \"vote_average\": 10.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/9Z1h2OktLoXANIPoT2ZmTBKDWju.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 33468,\n" +
                "    \"imdb_id\": \"tt0052646\",\n" +
                "    \"original_title\": \"The Brain That Wouldn't Die\",\n" +
                "    \"overview\": \"After his fiancГѓВ©e is decapitated in a car accident, Dr Cortner keeps the head alive and goes on the hunt for a beautiful replacement body.\",\n" +
                "    \"popularity\": 0.101907038837517,\n" +
                "    \"poster_path\": \"/aUW4dGyPCgwn8Rcg4rJUWPueQAi.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Rex Carlton Productions\",\n" +
                "        \"id\": 12335\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1962-08-10\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 82,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Alive... without a body... fed by an unspeakable horror from hell!\",\n" +
                "    \"title\": \"The Brain That Wouldn't Die\",\n" +
                "    \"vote_average\": 6.0,\n" +
                "    \"vote_count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/oqIHXfDqwAEphESicIg5yVS8bv2.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 71520,\n" +
                "    \"imdb_id\": \"tt0054017\",\n" +
                "    \"original_title\": \"Last Woman on Earth\",\n" +
                "    \"overview\": \"A Roger Corman sci-fi film about the last three people on the face of the earth.\",\n" +
                "    \"popularity\": 0.000154155101891318,\n" +
                "    \"poster_path\": \"/qfNdLu8y2B1UXXYJo14z5E80rq8.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [],\n" +
                "    \"release_date\": \"1960-08-05\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 71,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Last Woman on Earth\",\n" +
                "    \"vote_average\": 3.3,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/cSCRyNUHm4RJCM5oYQpW6jYXCaN.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 43109,\n" +
                "    \"imdb_id\": \"tt0052969\",\n" +
                "    \"original_title\": \"The Killer Shrews\",\n" +
                "    \"overview\": \"Trapped on a remote island by a hurricane, a group discover a doctor has been experimenting on creating half sized humans. Unfortunately, his experiments have also created giant shrews, who when they have run out of small animals to eat, turn on the humans....\",\n" +
                "    \"popularity\": 0.0237980136404663,\n" +
                "    \"poster_path\": \"/36HYkWNSlgGEWqYcNSDU45o1aFv.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Hollywood Pictures Corporation\",\n" +
                "        \"id\": 10747\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1959-06-25\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 69,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_639_1\": \"es\",\n" +
                "        \"name\": \"EspaГѓВ±ol\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"All that was left after...THE KILLER SHREWS!\",\n" +
                "    \"title\": \"The Killer Shrews\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/jR7HnoVy0tM2vO6LI5c9D7Klqw6.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10749,\n" +
                "        \"name\": \"Romance\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23627,\n" +
                "    \"imdb_id\": \"tt0033029\",\n" +
                "    \"original_title\": \"Second Chorus\",\n" +
                "    \"overview\": \"Danny O'Neill and Hank Taylor are rival trumpeters with the Perennials, a college band, and both men are still attending college by failing their exams seven years in a row. In the midst of a performance, Danny spies Ellen Miller who ends up being made band manager. Both men compete for her affections while trying to get the other one fired.\",\n" +
                "    \"popularity\": 0.02719924225607,\n" +
                "    \"poster_path\": \"/rFK0JJhRhuLJOJ6KoStYEnDn4bI.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Paramount Pictures\",\n" +
                "        \"id\": 4\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1941-01-03\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 84,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Second Chorus\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/p5QhHkpO1L5Xdu9qlV1oFcuSWPn.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 34078,\n" +
                "    \"imdb_id\": \"tt0052169\",\n" +
                "    \"original_title\": \"The Screaming Skull\",\n" +
                "    \"overview\": \"Newlyweds Eric and Jenni Whitlock retire to his desolate mansion, where Eric's first wife Marianne died from a mysterious freak accident. Jenni, who has a history of mental illness, begins to see strange things including a mysterious skull, which may or may not be a product of her imagination.\",\n" +
                "    \"popularity\": 0.0544743882244566,\n" +
                "    \"poster_path\": \"/wjwzsR16yb6b6Qlb0sHOwexwYHn.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Madera Productions\",\n" +
                "        \"id\": 14838\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"American International Pictures (AIP)\",\n" +
                "        \"id\": 9266\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1958-01-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 68,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The tortured ghost who claims vengeance in the bride's bedroom!\",\n" +
                "    \"title\": \"The Screaming Skull\",\n" +
                "    \"vote_average\": 2.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/v50TCgmKpxzJudSNTjO0kesKEiF.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10769,\n" +
                "        \"name\": \"Foreign\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 22379,\n" +
                "    \"imdb_id\": \"tt0098350\",\n" +
                "    \"original_title\": \"Slipstream\",\n" +
                "    \"overview\": \"Slipstream is a 1989 post-apocalyptic science fiction adventure film. The plot has an emphasis on aviation and contains many common science-fiction themes, such as taking place in a dystopian future in which the landscape of the Earth itself has been changed and is windswept by storms of great power. There are also numerous sub-plots, such as free will and humanity amongst artificial intelligence.\",\n" +
                "    \"popularity\": 0.0183822900880957,\n" +
                "    \"poster_path\": \"/ycjycihmyc3nqeNlKShEu3X1YyL.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [],\n" +
                "    \"release_date\": \"1989-06-22\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 102,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"From the depths of the earth. To the edge of existence... The hunt is on!\",\n" +
                "    \"title\": \"Slipstream\",\n" +
                "    \"vote_average\": 6.8,\n" +
                "    \"vote_count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/9N21kW3bwWoXtYIxzVERbybn0H3.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10769,\n" +
                "        \"name\": \"Foreign\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 22758,\n" +
                "    \"imdb_id\": \"tt0058983\",\n" +
                "    \"original_title\": \"Il Boia Scarlatto\",\n" +
                "    \"overview\": \"A photographer and his models go to an old, abandoned castle for a photo shoot. Unbeknownst to them, the castle is inhabited by a lunatic who believes himself to be the reincarnated spirit of a 17th-century executioner whose job it is to protect the castle against intruders.\",\n" +
                "    \"popularity\": 0.0459751226808032,\n" +
                "    \"poster_path\": \"/9Cxub7SCl7Im5jOm6HKGV7usdEu.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Atchity Entertainment International\",\n" +
                "        \"id\": 767\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"IT\",\n" +
                "        \"name\": \"Italy\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1965-11-28\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 87,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"it\",\n" +
                "        \"name\": \"Italiano\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"He was a homicidal maniac who LIVED TO KILL!\",\n" +
                "    \"title\": \"Bloody Pit of Horror\",\n" +
                "    \"vote_average\": 7.0,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 47749,\n" +
                "    \"imdb_id\": \"tt0093142\",\n" +
                "    \"original_title\": \"Hangmen\",\n" +
                "    \"overview\": \"Rob Greene has information about an undercover terror team inside the CIA led by Joe Connelly. To stay alive with the knowledge, he is advised to stay undercover by his supervisor Andrews. Connelly's men try to kill Greene, but he can escape and warns his son Danny that he also may be in danger and that he should look for Dog Thompson.\",\n" +
                "    \"popularity\": 0.0019874781059168,\n" +
                "    \"poster_path\": \"/onBgEtNEuWf9HagEJwMYLsi9IMk.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [],\n" +
                "    \"release_date\": \"1987-11-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 90,\n" +
                "    \"spoken_languages\": [],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Hangmen\",\n" +
                "    \"vote_average\": 6.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/rvnGQgl2P1JolX4spxTt7vZ2pqa.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 3122,\n" +
                "    \"imdb_id\": \"tt0067321\",\n" +
                "    \"original_title\": \"La figlia di Frankenstein\",\n" +
                "    \"overview\": \"Dr. Frankensteins' daughter, who is in love with the aging lab assistant Marshall, continues with her fathers experiments and attempts to transplant Marshall's brain into a new body to prolong his life.\",\n" +
                "    \"popularity\": 0.0159970986841553,\n" +
                "    \"poster_path\": \"/7RUwqMnjZvoLbL63ZL2FGv7qAi8.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Condor International Productions\",\n" +
                "        \"id\": 5712\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"IT\",\n" +
                "        \"name\": \"Italy\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1973-10-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 99,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_639_1\": \"it\",\n" +
                "        \"name\": \"Italiano\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"A Mad Surgeon's Mind in a Woman's Body\",\n" +
                "    \"title\": \"Lady Frankenstein\",\n" +
                "    \"vote_average\": 4.2,\n" +
                "    \"vote_count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/Ar0PSIPPCEigjCMhhlSCnULpNqE.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 80,\n" +
                "        \"name\": \"Crime\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 21256,\n" +
                "    \"imdb_id\": \"tt0066856\",\n" +
                "    \"original_title\": \"Born To Win\",\n" +
                "    \"overview\": \"A smart-mouthed junkie/loser known as J.J. (George Segal) spends his days looking for just \\\"one more fix\\\".\",\n" +
                "    \"popularity\": 1.2794539710121e-05,\n" +
                "    \"poster_path\": \"/a3ZByaaOxykYXr0OO4WZxUPmmBn.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [],\n" +
                "    \"release_date\": \"1971-01-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 88,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Born To Win\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 89581,\n" +
                "    \"imdb_id\": \"tt0029989\",\n" +
                "    \"original_title\": \"Child Bride\",\n" +
                "    \"overview\": \"Jennie is a twelve-year-old girl living with her parents in extremely rural mountain country. Her schoolteacher, Miss Carol, though a mountain girl herself, has gone off to be educated and returned in hopes of stopping the tradition of child marriage which permeates the culture. Jennie's father Ira is a good man who tries to protect Miss Carol from the men who threaten her if she doesn't call off her crusade. One of these men, Jake Bolby, has his eye on little Jennie and plots to make her his bride.\",\n" +
                "    \"popularity\": 0.000242361556422809,\n" +
                "    \"poster_path\": \"/hGMcPvRiaFkVdoLbMCx7U5e4KxI.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Astor Pictures Corp.\",\n" +
                "        \"id\": 20545\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1938-03-02\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 62,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"A THROBBING DRAMA OF SHACKLED YOUTH!\",\n" +
                "    \"title\": \"Child Bride\",\n" +
                "    \"vote_average\": 4.5,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/ykBVHoEYdkrMowYg8S2FGJX3K3S.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 27717,\n" +
                "    \"imdb_id\": \"tt0055294\",\n" +
                "    \"original_title\": \"The Phantom Planet\",\n" +
                "    \"overview\": \"After an invisible asteroid draws an astronaut and his ship to its surface, he is miniaturized by the phantom planet's exotic atmosphere.\",\n" +
                "    \"popularity\": 0.0195523870307896,\n" +
                "    \"poster_path\": \"/sGwsMGUJ8RRLIBgEOXrDrqZBR4H.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Four Crown Productions\",\n" +
                "        \"id\": 4704\n" +
                "      }\n" +
                "    ],\n";

        return
                str1 +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1961-12-13\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 82,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"It Begins Where Others End! On the Moon!\",\n" +
                "    \"title\": \"The Phantom Planet\",\n" +
                "    \"vote_average\": 5.5,\n" +
                "    \"vote_count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/sgIT39BV4kchbRd9fU2Z0UjPNEI.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 80,\n" +
                "        \"name\": \"Crime\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 99,\n" +
                "        \"name\": \"Documentary\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10749,\n" +
                "        \"name\": \"Romance\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 35139,\n" +
                "    \"imdb_id\": \"tt0053337\",\n" +
                "    \"original_title\": \"Teenagers From Outer Space\",\n" +
                "    \"overview\": \"A young alien (David Love) falls for a pretty teenage Earth girl (Dawn Anderson) and they team up to try to stop the plans of his invading cohorts, who intend to use Earth as a food-breeding ground for giant lobsters from their planet. The invaders, who arrive in a flying saucer, carry deadly ray guns that turn Earth-people into skeletons.\",\n" +
                "    \"popularity\": 0.000178898544126104,\n" +
                "    \"poster_path\": \"/pHmXPfCarJSRErUo9LEVxgJqcAC.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Tom Graeff Productions\",\n" +
                "        \"id\": 13941\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Warner Bros.\",\n" +
                "        \"id\": 6194\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1959-06-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 86,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Thrill-crazed space kids blasting the flesh off humans!\",\n" +
                "    \"title\": \"Teenagers From Outer Space\",\n" +
                "    \"vote_average\": 3.5,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 9648,\n" +
                "        \"name\": \"Mystery\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 37521,\n" +
                "    \"imdb_id\": \"tt0071426\",\n" +
                "    \"original_title\": \"The Disappearance of Flight 412\",\n" +
                "    \"overview\": \"Colonel Pete Moore (Glenn Ford) is commander of the Whitney Radar Test Group, which has been experiencing electrical difficulties aboard its aircraft. To ferret out the problem, he sends a four-man crew on Flight 412. Shortly into the test, the jet picks up three blips on radar, and subsequently, two fighters scramble and mysteriously disappear. At this point, Flight 412 is monitored and forced to land by Digger Control, a top-level, military intelligence group that debunks UFO information. The intrepid colonel, kept in the dark about his crew, decides to investigate the matter himself.\",\n" +
                "    \"popularity\": 0.000174395862838363,\n" +
                "    \"poster_path\": \"/osiDh4EKEwNPkFWBxa5GWbNc9fb.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"NBC\",\n" +
                "        \"id\": 1502\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1974-10-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 72,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"The Disappearance of Flight 412\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/9mmm4iT4dda1PYxwAY4z3NTHHrq.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 31134,\n" +
                "    \"imdb_id\": \"tt0075343\",\n" +
                "    \"original_title\": \"Track of the Moon Beast\",\n" +
                "    \"overview\": \"Professor \\\"Johnny Longbow\\\" Salina, a man who really knows his stews, introduces Paul Carlson to the practical-joking Kathy Nolan. Paul and Kathy seem to hit it off rather well but, during a meteor storm, a meteorite fragment strikes Paul, burying itself deep in his skull, which has the unpleasant side-effect of causing Paul to mutate into a giant reptilian monster at night and go on murderous rampages. It turns out that this sort of thing has happened before, when Professor Salina rediscovers ancient Native American paintings detailing a similar event many centuries ago. Kathy, however, still loves Paul, and tries to save him.\",\n" +
                "    \"popularity\": 0.0002767921875,\n" +
                "    \"poster_path\": \"/3cqfZwmPqdEkDrnoSNeZ6POU8Ww.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1976-01-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 90,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Track of the Moon Beast\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/kHs4BjS7c8SWptvVkcTxOHmyIqk.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 34077,\n" +
                "    \"imdb_id\": \"tt0052846\",\n" +
                "    \"original_title\": \"The Giant Gila Monster\",\n" +
                "    \"overview\": \"A small town in Texas finds itself under attack from a hungry, fifty-foot-long gila monster. No longer content to forage in the desert, the giant lizard begins chopming on motorists and train passengers before descending upon the town itself. Only Chase Winstead, a quick-thinking mechanic, can save the town from being wiped out.\",\n" +
                "    \"popularity\": 0.00634480625573004,\n" +
                "    \"poster_path\": \"/9QuykI21rdNQdahJr22hzpzHxJI.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1959-01-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 74,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"The Giant Gila Monster\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/dMWq0KAdw256MHYnSzpfHwZy5Yq.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 50000,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 27545,\n" +
                "    \"imdb_id\": \"tt0054462\",\n" +
                "    \"original_title\": \"The Wasp Woman\",\n" +
                "    \"overview\": \"A cosmetics queen develops a youth formula from jelly taken from queen wasps. She fails to anticipate the typical hoary side effects.\",\n" +
                "    \"popularity\": 0.0326650447650572,\n" +
                "    \"poster_path\": \"/rvdonRqGo77VBmeU5qcrHQ3uuAj.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Film Group Feature\",\n" +
                "        \"id\": 15301\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Santa Cruz Productions Inc.\",\n" +
                "        \"id\": 15302\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1959-11-02\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 73,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Horror Of The Winged Menace !\",\n" +
                "    \"title\": \"The Wasp Woman\",\n" +
                "    \"vote_average\": 5.8,\n" +
                "    \"vote_count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/wYm5QmApMF8YgZhY9NsOn1IKZvm.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"Fantasy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10751,\n" +
                "        \"name\": \"Family\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 18698,\n" +
                "    \"imdb_id\": \"tt0044762\",\n" +
                "    \"original_title\": \"Jack and the Beanstalk\",\n" +
                "    \"overview\": \"Abbott and Costello's version of the famous fairy tale, about a young boy who trades the family cow for magic beans.\",\n" +
                "    \"popularity\": 0.128373222836917,\n" +
                "    \"poster_path\": \"/yhMmNqc1xPkwA7qafkIApKwPcPF.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Exclusive Productions Inc.\",\n" +
                "        \"id\": 19691\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Warner Bros.\",\n" +
                "        \"id\": 6194\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1952-04-12\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 70,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Be happy go wacky!\",\n" +
                "    \"title\": \"Jack and the Beanstalk\",\n" +
                "    \"vote_average\": 5.5,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/skwmyYxbYxHMzIW1ScLUDxgSWZI.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23389,\n" +
                "    \"imdb_id\": \"tt0028174\",\n" +
                "    \"original_title\": \"Revolt of the Zombies\",\n" +
                "    \"overview\": \"On the Franco-Austrian Frontier during World War I, an oriental priest, chaplain of a French colonial regiment, is condemned to life imprisonment because he possesses the power to turn men into zombies. In his prison cell, the priest prepares to burn a parchment containing the location of the secret formula.\",\n" +
                "    \"popularity\": 0.000345922824912343,\n" +
                "    \"poster_path\": \"/7MPo8rp7bTUpsaseVLBDQJwugse.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1936-06-04\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 65,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Revolt of the Zombies\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/aFILbZE0o2Tg0lgx8cKU7Y3IMhP.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 28586,\n" +
                "    \"imdb_id\": \"tt0054393\",\n" +
                "    \"original_title\": \"Tormented\",\n" +
                "    \"overview\": \"A jazz pianist (Richard Carlson) is haunted by his dead ex-lover's (Juli Reding) crawling hand and floating head.\",\n" +
                "    \"popularity\": 0.000589035941067991,\n" +
                "    \"poster_path\": \"/mK7fauKH3WY1t3M4MtnoELSeIiw.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Cheviot Productions\",\n" +
                "        \"id\": 14270\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Allied Artists Pictures\",\n" +
                "        \"id\": 4928\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1960-09-22\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 75,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"A ghost-woman owned him body and soul!\",\n" +
                "    \"title\": \"Tormented\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/54FXuO5X2j5CIct5zsVJOPI5Bc4.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 80,\n" +
                "        \"name\": \"Crime\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 5926,\n" +
                "    \"imdb_id\": \"tt0052862\",\n" +
                "    \"original_title\": \"The Great St. Louis Bank Robbery\",\n" +
                "    \"overview\": \"Career criminals (David Clarke, Graham Denton) and a local youth (Steve McQueen) carefully plan and rehearse the robbery of a Missouri bank.\",\n" +
                "    \"popularity\": 0.0618403807737488,\n" +
                "    \"poster_path\": \"/nXq3Wtfy61FZhgocq3bZaCyWTpu.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1959-09-10\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 85,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"The Great St. Louis Bank Robbery\",\n" +
                "    \"vote_average\": 10.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/asgGSCiJXReOfa463cbvnlvJuK0.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23122,\n" +
                "    \"imdb_id\": \"tt0025465\",\n" +
                "    \"original_title\": \"Maniac\",\n" +
                "    \"overview\": \"An ex-vaudeville actor is working as the assistant to a doctor who has Frankenstein aspirations. The ex-vaudeville actor kills the doctor and decides to assume the identity of the dead physician.\",\n" +
                "    \"popularity\": 0.00221049260954342,\n" +
                "    \"poster_path\": \"/jTHYNaVhHDArWyafjP8bQAdZxSF.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Road Show Attractions\",\n" +
                "        \"id\": 4181\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1934-09-11\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 51,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Maniac\",\n" +
                "    \"vote_average\": 4.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/vBeSwFHtmEpcNh9OXOReeqlSdmU.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"Fantasy\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 43144,\n" +
                "    \"imdb_id\": \"tt0052394\",\n" +
                "    \"original_title\": \"The Wild Women of Wongo\",\n" +
                "    \"overview\": \"On the tropical island of Wongo, a tribe of beautiful women discover that the other side of the island is inhabited by a tribe of handsome men. They also discover that a tribe of evil ape men live on the island, too, and the ape men are planning a raid on the tribe in order to capture mates.\",\n" +
                "    \"popularity\": 0.000150345859494824,\n" +
                "    \"poster_path\": \"/4mXpmlrmz2aa099DZGtkUXZ6KG3.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1958-01-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 71,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"The Wild Women of Wongo\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/i8LZJwg665GZGpWnXxQAMgUCuhm.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 43368,\n" +
                "    \"imdb_id\": \"tt0044420\",\n" +
                "    \"original_title\": \"The Big Trees\",\n" +
                "    \"overview\": \"A Quaker colony tries to save the giant sequoias from a timber baron.\",\n" +
                "    \"popularity\": 0.0720010539678668,\n" +
                "    \"poster_path\": \"/23kldjf9wR14LzYJqtV1W8Bf04w.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Warner Bros.\",\n" +
                "        \"id\": 6194\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1952-02-05\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 89,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"The Big Trees\",\n" +
                "    \"vote_average\": 4.5,\n" +
                "    \"vote_count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/4z9zkewGIIoLpzU8Elimg4cjZb0.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23045,\n" +
                "    \"imdb_id\": \"tt0047149\",\n" +
                "    \"original_title\": \"Killers from Space\",\n" +
                "    \"overview\": \"Atomic scientist/pilot Doug Martin is missing after his plane crashes on an reconnaissance mission after a nuclear test. Miraculously appearing unhurt at the base later, he is given sodium amethol, but authorities are skeptical of his story that he was captured by aliens determined to conquer the Earth with giant monsters and insects. Martin vows to use existing technology to destroy them.\",\n" +
                "    \"popularity\": 0.0179123305457868,\n" +
                "    \"poster_path\": \"/ynSSmhtGS3HHnRXG9IXmUxPh0YZ.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Planet Filmplays\",\n" +
                "        \"id\": 19584\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1954-01-23\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 71,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The last word in science-fiction thrills!\",\n" +
                "    \"title\": \"Killers from Space\",\n" +
                "    \"vote_average\": 3.7,\n" +
                "    \"vote_count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 50000,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 28160,\n" +
                "    \"imdb_id\": \"tt0068658\",\n" +
                "    \"original_title\": \"Grave of the Vampire\",\n" +
                "    \"overview\": \"A vampire awakens from a long sleep to attack a couple making love in a graveyard. He then rapes the woman, who later gives birth to his son. The newborn infant will only drink blood from his mother's breast.\",\n" +
                "    \"popularity\": 3.93473934140625e-07,\n" +
                "    \"poster_path\": \"/rN4w37kWlR2alZSoy8iTav5hWFJ.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1972-09-13\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 95,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Grave of the Vampire\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/h7XjxqiCxjYbyO9Zx2e9yXXIUBT.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"Fantasy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10769,\n" +
                "        \"name\": \"Foreign\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 39402,\n" +
                "    \"imdb_id\": \"tt0052782\",\n" +
                "    \"original_title\": \"Ercole e la regina di Lidia\",\n" +
                "    \"overview\": \"En route to Thebes for an important diplomatic mission, Hercules drinks from a magic spring and loses his memory. He spends most of the movie in the pleasure gardens of Queen Omphale of Lydia. While young Ulysses tries to help him regain his memory, political tensions escalate in Thebes, and Hercules' new wife Iole finds herself in mortal danger.\",\n" +
                "    \"popularity\": 0.00507588707311304,\n" +
                "    \"poster_path\": \"/hxEUaqjAz36CU5w15LHQpbPLq4u.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Galatea Film\",\n" +
                "        \"id\": 12240\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Lux Compagnie CinГѓВ©matographique de France\",\n" +
                "        \"id\": 12243\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Lux Film\",\n" +
                "        \"id\": 1679\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Urania Film\",\n" +
                "        \"id\": 12242\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"ES\",\n" +
                "        \"name\": \"Spain\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"FR\",\n" +
                "        \"name\": \"France\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"IT\",\n" +
                "        \"name\": \"Italy\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1959-02-14\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 98,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"it\",\n" +
                "        \"name\": \"Italiano\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_639_1\": \"es\",\n" +
                "        \"name\": \"EspaГѓВ±ol\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"SEE the War of the Chariots! SEE Lydia, the Temptress! SEE the Contest of Giants! SEE the Combat of Kings! SEE the Arena of Tigers! SEE the Court of Lovers!\",\n" +
                "    \"title\": \"Hercules Unchained\",\n" +
                "    \"vote_average\": 4.5,\n" +
                "    \"vote_count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/2W19ws7wz26aCdMedubFepTklDn.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 48202,\n" +
                "    \"imdb_id\": \"tt0054768\",\n" +
                "    \"original_title\": \"Creature from the Haunted Sea\",\n" +
                "    \"overview\": \"A crook decides to bump off members of his inept crew and blame their deaths on a legendary sea creature. What he doesn't know is that the creature is real.\",\n" +
                "    \"popularity\": 0.000242350157918506,\n" +
                "    \"poster_path\": \"/hhHW2Japfkw3Cm2rSvGtTFEAhIt.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Roger Corman Productions\",\n" +
                "        \"id\": 14047\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1961-06-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 63,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"This Gangster's \\\"Single Partner\\\" Isn't Even Human!\",\n" +
                "    \"title\": \"Creature from the Haunted Sea\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/enkQ0GyAp9tWWVHNE6qNDbqeODd.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 37,\n" +
                "        \"name\": \"Western\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 43384,\n" +
                "    \"imdb_id\": \"tt0044186\",\n" +
                "    \"original_title\": \"Vengeance Valley\",\n" +
                "    \"overview\": \"A cattle baron takes in an orphaned boy and raises him, causing his own son to resent the boy. As they get older the resentment festers into hatred, and eventually the real son frames his stepbrother for fathering an illegitimate child that is actually his, seeing it as an opportunity to get his half-brother out of the way so he can have his father's empire all to himself.\",\n" +
                "    \"popularity\": 0.0268597913065356,\n" +
                "    \"poster_path\": \"/hPAgboTs1llWe9nH2tGZBfuQDVi.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Metro-Goldwyn-Mayer (MGM)\",\n" +
                "        \"id\": 8411\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1951-02-06\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 83,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Vengeance Valley\",\n" +
                "    \"vote_average\": 6.0,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/xF9QarK3htVxdZt4StA1dnrw44U.jpg\",\n" +
                "    \"belongs_to_collection\": {\n" +
                "      \"id\": 161766,\n" +
                "      \"name\": \"Gamera Films\",\n" +
                "      \"poster_path\": \"/vcLgnb02VCBZmzmqync5lfBanCa.jpg\",\n" +
                "      \"backdrop_path\": \"/ce67OOF0Nw4WFgn7pTo2GQs6NTp.jpg\"\n" +
                "    },\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 26947,\n" +
                "    \"imdb_id\": \"tt0064360\",\n" +
                "    \"original_title\": \"Gamera tai daiakuju Giron\",\n" +
                "    \"overview\": \"Two boys are taken to another planet by a UFO. The good turtle monster Gamera must fight Guiron to rescue them.\",\n" +
                "    \"popularity\": 0.000306613081971933,\n" +
                "    \"poster_path\": \"/eRz5herhfKYXowCOkPhyiMVnPVu.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Daiei Motion Picture Company\",\n" +
                "        \"id\": 3214\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"JP\",\n" +
                "        \"name\": \"Japan\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1969-03-21\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 82,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_639_1\": \"ja\",\n" +
                "        \"name\": \"Г¦вЂ”ВҐГ¦Е“В¬ГЁВЄЕѕ\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"iso_639_1\": \"de\",\n" +
                "        \"name\": \"Deutsch\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Attack of the Monsters\",\n" +
                "    \"vote_average\": 3.8,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/gQtGynhwZSoume5Yh8Uxuk0FoPQ.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 9648,\n" +
                "        \"name\": \"Mystery\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 53,\n" +
                "        \"name\": \"Thriller\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23622,\n" +
                "    \"imdb_id\": \"tt0039800\",\n" +
                "    \"original_title\": \"Scared to Death\",\n" +
                "    \"overview\": \"A woman is married to the son of a doctor, the proprietor of a private sanatorium, where she is under unwilling treatment. Both the son and the doctor indicate they want the marriage dissolved. Arriving at the scene is a mysterious personage identified as the doctor's brother who formerly was a stage magician in Europe. He is accompanied by a threatening dwarf...\",\n" +
                "    \"popularity\": 0.000164030159433398,\n" +
                "    \"poster_path\": \"/rlvBCa4wHcAlegTF0x6rB0cGkhY.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Golden Gate Pictures\",\n" +
                "        \"id\": 4242\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1947-02-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 65,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Scared to Death\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/fxu4ud5VVY7Nct2qCMb4IxmBRH7.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 35611,\n" +
                "    \"imdb_id\": \"tt0054330\",\n" +
                "    \"original_title\": \"Space Men\",\n" +
                "    \"overview\": \"Interplanetary News reporter Ray Peterson is assigned aboard a space station in the 21st Century.\",\n" +
                "    \"popularity\": 0.00201467846185601,\n" +
                "    \"poster_path\": \"/no4HlVFWDhSLfqfRH5K9m6vEdUg.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Titanus\",\n" +
                "        \"id\": 641\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Ultra Film\",\n" +
                "        \"id\": 11994\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1960-08-25\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 73,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"it\",\n" +
                "        \"name\": \"Italiano\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Fear awaits ...... in the murky mists of outer space!\",\n" +
                "    \"title\": \"Assignment: Outer Space\",\n" +
                "    \"vote_average\": 2.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/rHdz8ptHaJaXgwlE97XnYcLGjiQ.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 37,\n" +
                "        \"name\": \"Western\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 53827,\n" +
                "    \"imdb_id\": \"tt0026267\",\n" +
                "    \"original_title\": \"The Dawn Rider\",\n" +
                "    \"overview\": \"When John Mason's father is killed, John is wounded. Attracted to his nurse Alice, a conflict arises between him and his friend Ben who plans to marry Alice. John later finds the killer of his father but goes to face him not knowing Ben has removed the bullets from his gun.\",\n" +
                "    \"popularity\": 0.00568996457771338,\n" +
                "    \"poster_path\": \"/ieJCBEsdMu1peocpPRRDKnhTfeN.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Monogram Pictures\",\n" +
                "        \"id\": 4395\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Lone Star Production\",\n" +
                "        \"id\": 4114\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1935-06-20\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 52,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The End Of The Vengeance Trai\",\n" +
                "    \"title\": \"The Dawn Rider\",\n" +
                "    \"vote_average\": 5.5,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/cthtBQ0UfjlIp0Q0ERXu4ozFJ2w.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 37744,\n" +
                "    \"imdb_id\": \"tt0042897\",\n" +
                "    \"original_title\": \"Rocketship X-M\",\n" +
                "    \"overview\": \"Astronauts blast off to explore the moon. A craft malfunction and some fuel miscalculations cause them to end up landing on Mars. On Mars, evidence of a once powerful civilization is found. The scientists determined that an atomic war destroyed most of the Martians. Those that survived reverted to a caveman like existence.\",\n" +
                "    \"popularity\": 0.0252448994347753,\n" +
                "    \"poster_path\": \"/n3YzWNfKNyyAC2ExzM3zxgrEs7H.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Lippert Pictures\",\n" +
                "        \"id\": 4946\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1950-06-02\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 77,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The screen's first story of man's conquest of space!\",\n" +
                "    \"title\": \"Rocketship X-M\",\n" +
                "    \"vote_average\": 4.5,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/l1SjpqKzXuKp5yLz1Vn3wCxbzl5.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23325,\n" +
                "    \"imdb_id\": \"tt0042209\",\n" +
                "    \"original_title\": \"At War With The Army\",\n" +
                "    \"overview\": \"Martin and Lewis are former nightclub partners who are now enlisted in the Army. Sergeant Puccinelli (Martin) now ranks above his former partner, Private First Class Korwin (Lewis). Puccinelli is desperately trying to get transferred from his dull job to active duty overseas. Meanwhile, all Korwin wants is a pass to see his wife and new baby.\",\n" +
                "    \"popularity\": 0.0057358259874891,\n" +
                "    \"poster_path\": \"/gITmnjisT3veDW9KkrigLHKqKTE.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Fred F. Finklehoffe Productions\",\n" +
                "        \"id\": 5696\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1951-01-17\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 93,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"At War With The Army\",\n" +
                "    \"vote_average\": 7.3,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/znlYGOExFoRxyaNtW0ng5TA3T71.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10749,\n" +
                "        \"name\": \"Romance\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 18703,\n" +
                "    \"imdb_id\": \"tt0040626\",\n" +
                "    \"original_title\": \"My Dear Secretary\",\n" +
                "    \"overview\": \"A budding young writer thinks it's her lucky day when she is chosen to be the new secretary for Owen Waterbury, famous novelist. She is soon disppointed, however, when he turns out to be an erratic, immature playboy. Opposites attract, of course, but not without sub-plots that touch on competitiveness within marriage and responsibility.\",\n" +
                "    \"popularity\": 0.0919791859986779,\n" +
                "    \"poster_path\": \"/koUn743fc9fSNcWTyAGse1UIXsf.png\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Cardinal Pictures\",\n" +
                "        \"id\": 3583\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1949-01-12\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 94,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"My Dear Secretary\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 37,\n" +
                "        \"name\": \"Western\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 68082,\n" +
                "    \"imdb_id\": \"tt0049121\",\n" +
                "    \"original_title\": \"Daniel Boone, Trail Blazer\",\n" +
                "    \"overview\": \"Daniel Boone leads settlers into Kentucky, but must battle Shawnee Indians who have been persuaded by a French renegade that Boone and the settlers are there to kill them and steal their land.\",\n" +
                "    \"popularity\": 0.00290528195590369,\n" +
                "    \"poster_path\": \"/8duGXzNdMP3E7SLnsS2hi7Ak2hI.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [],\n" +
                "    \"release_date\": \"1956-10-05\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 74,\n" +
                "    \"spoken_languages\": [],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Daniel Boone, Trail Blazer\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/cKrUoQhrj3f2VuR70oUUkrg2iLg.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23293,\n" +
                "    \"imdb_id\": \"tt0046186\",\n" +
                "    \"original_title\": \"Phantom from Space\",\n" +
                "    \"overview\": \"The story concerns the sighting of a UFO which appears to have crashed in the San Fernando Valley, after which massive interference with teleradio transmission brings FCC investigators into action. They, in turn, begin encountering reports from people of seeing what appears to be a man dressed in a bizarre outfit.\",\n" +
                "    \"popularity\": 0.000156877929851318,\n" +
                "    \"poster_path\": \"/9gdgsVmvuQPh8atqvuuXvSEl0ee.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"United Artists\",\n" +
                "        \"id\": 60\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1953-05-15\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 73,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The secret power menaced the world!\",\n" +
                "    \"title\": \"Phantom from Space\",\n" +
                "    \"vote_average\": 6.0,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/l6dp3OhlzhEQ6cgGbyhVBsTitYr.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 22699,\n" +
                "    \"imdb_id\": \"tt0054285\",\n" +
                "    \"original_title\": \"Seddok, l'erede di Satana\",\n" +
                "    \"overview\": \"When a singer (Susanne Loret) is horribly disfigured in a car accident, a scientist (Alberto Lupo) develops a treatment which can restore her beauty by injecting her with a special serum. While performing the procedure, however, he falls in love with her. As the treatment begins to fail, he determines to save her appearance, regardless of how many women he must kill for her sake.\",\n" +
                "    \"popularity\": 0.00107518226929465,\n" +
                "    \"poster_path\": \"/hk84s1g3Xa3hIgN7LehoVX376Mn.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Manson Distributing Corp\",\n" +
                "        \"id\": 4134\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"IT\",\n" +
                "        \"name\": \"Italy\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1960-08-16\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 105,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"it\",\n" +
                "        \"name\": \"Italiano\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"You'll gasp with Horror...\",\n" +
                "    \"title\": \"Atom Age Vampire\",\n" +
                "    \"vote_average\": 1.5,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/qND29FxcslMT05bUdraPAfNlLsc.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 80,\n" +
                "        \"name\": \"Crime\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 48385,\n" +
                "    \"imdb_id\": \"tt0049363\",\n" +
                "    \"original_title\": \"The Indestructible Man\",\n" +
                "    \"overview\": \"Scientific experiments accidentally revive an executed criminal and make him impervious to harm, prompting him to seek revenge on his former partners.\",\n" +
                "    \"popularity\": 0.000177654853604629,\n" +
                "    \"poster_path\": \"/z1zSn7r8wfMluSP9YiUk8OKLK6E.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"C.G.K. Productions\",\n" +
                "        \"id\": 34284\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1956-03-25\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 70,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"The Screen's 300,000 Volt SHOCKER!\",\n" +
                "    \"title\": \"The Indestructible Man\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 22734,\n" +
                "    \"imdb_id\": \"tt0045551\",\n" +
                "    \"original_title\": \"Beneath the 12-Mile Reef\",\n" +
                "    \"overview\": \"Mike and Tony Petrakis are a Greek father and son team who dive for sponges off the coast of Florida. After they are robbed by crooks, Arnold and the Rhys brothers, Mike decides to take his men to the dangerous 12-mile reef to dive for more sponges. Mike suffers a fatal accident when he falls from the reef leaving Tony to carry on the business. But now he has a companion, Gwyneth Rhys.\",\n" +
                "    \"popularity\": 0.00100316280175893,\n" +
                "    \"poster_path\": \"/m7WWdmtVmnatxCsaA6Ss0STkyty.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"20th Century Fox\",\n" +
                "        \"id\": 25\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1953-12-02\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 102,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"You see it without special glasses !\",\n" +
                "    \"title\": \"Beneath the 12-Mile Reef\",\n" +
                "    \"vote_average\": 4.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": null,\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10751,\n" +
                "        \"name\": \"Family\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 23115,\n" +
                "    \"imdb_id\": \"tt0047189\",\n" +
                "    \"original_title\": \"Long John Silver\",\n" +
                "    \"overview\": \"In this sequel to Treasure Island, Long John hopes to rescue his friend Jim from a rival pirate and return for more treasure.\",\n" +
                "    \"popularity\": 0.000168532320789622,\n" +
                "    \"poster_path\": \"/dfycxSeabZhy0bLYNBuMqqttQNr.jpg\",\n" +
                "    \"production_companies\": [],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"AU\",\n" +
                "        \"name\": \"Australia\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1954-12-16\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 106,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"\",\n" +
                "    \"title\": \"Long John Silver\",\n" +
                "    \"vote_average\": 7.0,\n" +
                "    \"vote_count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/oSkavGF5z9rsUsfZ8812dm85Nbn.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 22856,\n" +
                "    \"imdb_id\": \"tt0043360\",\n" +
                "    \"original_title\": \"Bride of the Gorilla\",\n" +
                "    \"overview\": \"Raymond Burr is a plantation owner who changes into a gorilla and terrorizes his wife, baffling the local authorities.\",\n" +
                "    \"popularity\": 0.000396194327699912,\n" +
                "    \"poster_path\": \"/mrVLT5enH1faAeDSpDPJUy54cmO.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Jack Broder Productions Inc.\",\n" +
                "        \"id\": 5699\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1951-10-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 70,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"A Blonde Beauty and a Savage Beast... alone in the Jungle!\",\n" +
                "    \"title\": \"Bride of the Gorilla\",\n" +
                "    \"vote_average\": 4.0,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/5fSi0Aax61unEoGVYEIbu9oBNuF.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"Comedy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 38404,\n" +
                "    \"imdb_id\": \"tt0044406\",\n" +
                "    \"original_title\": \"Bela Lugosi Meets a Brooklyn Gorilla\",\n" +
                "    \"overview\": \"A mad scientist, a remote island..let the fun begin.\",\n" +
                "    \"popularity\": 0.0187656561809385,\n" +
                "    \"poster_path\": \"/dbxnpVI9XNUpUgjYjHyhE5DHqL1.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Jack Broder Productions Inc.\",\n" +
                "        \"id\": 5699\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1952-10-08\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 74,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"A horror film that will stiffen you with laughter!\",\n" +
                "    \"title\": \"Bela Lugosi Meets a Brooklyn Gorilla\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/i8fELZjTLpe7dF3VwxAL4du7nVw.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 878,\n" +
                "        \"name\": \"Science Fiction\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 37426,\n" +
                "    \"imdb_id\": \"tt0032215\",\n" +
                "    \"original_title\": \"The Ape\",\n" +
                "    \"overview\": \"A mad scientist searching for a cure for polio. Dr. Bernard Adrian is a kindly mad scientist who seeks to cure a young woman's polio. He needs spinal fluid from a human to complete the formula for his experimental serum. Meanwhile, a vicious circus ape has broken out of its cage, and is terrorizing towns people.\",\n" +
                "    \"popularity\": 0.00481224884273804,\n" +
                "    \"poster_path\": \"/kHk3YFVAnZuCrqK2SA0BWdTObzD.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"Monogram Pictures\",\n" +
                "        \"id\": 4395\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1940-09-30\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 62,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Jungle Beast or Man of Science?\",\n" +
                "    \"title\": \"The Ape\",\n" +
                "    \"vote_average\": 4.3,\n" +
                "    \"vote_count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/e7qAhGvMBlPDhl8H4aHjeU4rJVr.jpg\",\n" +
                "    \"belongs_to_collection\": null,\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"name\": \"Adventure\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Drama\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 27,\n" +
                "        \"name\": \"Horror\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 22749,\n" +
                "    \"imdb_id\": \"tt0054691\",\n" +
                "    \"original_title\": \"Bloodlust\",\n" +
                "    \"overview\": \"Two couples (Robert Reed, June Kenney, Joan Lora, and Eugene Persson) are on a boating trip when they come across an uncharted island. The four investigate and find themselves in the clutches of Dr. Albert Balleau (Wilton Graff), whose hobby is hunting both animals and humansГўв‚¬В¦ The group tries to escape only to be thwarted by Dr. Balleau and his henchmen.\",\n" +
                "    \"popularity\": 0.00599281776693237,\n" +
                "    \"poster_path\": \"/2s2Wo0MbuLIuHTWj60CoNehOsz0.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"cinegrafik\",\n" +
                "        \"id\": 26958\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1961-09-13\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 68,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Maniac Hunts Humans In A Jungle Hell!\",\n" +
                "    \"title\": \"Bloodlust\",\n" +
                "    \"vote_average\": 0.0,\n" +
                "    \"vote_count\": 0\n" +
                "  },\n" +
                "  {\n" +
                "    \"adult\": false,\n" +
                "    \"backdrop_path\": \"/cKUSB7Hmp2IUlJGVdEq5VXaeK81.jpg\",\n" +
                "    \"belongs_to_collection\": {\n" +
                "      \"id\": 224011,\n" +
                "      \"name\": \"Dick Tracy 1940s Collection\",\n" +
                "      \"poster_path\": null,\n" +
                "      \"backdrop_path\": null\n" +
                "    },\n" +
                "    \"budget\": 0,\n" +
                "    \"genres\": [\n" +
                "      {\n" +
                "        \"id\": 28,\n" +
                "        \"name\": \"Action\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 80,\n" +
                "        \"name\": \"Crime\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 9648,\n" +
                "        \"name\": \"Mystery\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"homepage\": \"\",\n" +
                "    \"id\": 112842,\n" +
                "    \"imdb_id\": \"tt0037642\",\n" +
                "    \"original_title\": \"Dick Tracy\",\n" +
                "    \"overview\": \"Detective Tracy (Morgan Conway) rescues Tess Trueheart (Anne Jeffreys) and Junior from a killer called Splitface (Mike Mazurki).\",\n" +
                "    \"popularity\": 0.00160540949606792,\n" +
                "    \"poster_path\": \"/44fgqjs5DLvQDTTyJ8c2i0Yyy9v.jpg\",\n" +
                "    \"production_companies\": [\n" +
                "      {\n" +
                "        \"name\": \"RKO Radio Pictures\",\n" +
                "        \"id\": 6\n" +
                "      }\n" +
                "    ],\n" +
                "    \"production_countries\": [\n" +
                "      {\n" +
                "        \"iso_3166_1\": \"US\",\n" +
                "        \"name\": \"United States of America\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"release_date\": \"1945-12-01\",\n" +
                "    \"revenue\": 0,\n" +
                "    \"runtime\": 61,\n" +
                "    \"spoken_languages\": [\n" +
                "      {\n" +
                "        \"iso_639_1\": \"en\",\n" +
                "        \"name\": \"English\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"status\": \"Released\",\n" +
                "    \"tagline\": \"Dick Tracy takes on the scar-faced, dirty-thug known as\",\n" +
                "    \"title\": \"Dick Tracy\",\n" +
                "    \"vote_average\": 6.0,\n" +
                "    \"vote_count\": 1\n" +
                "  }\n" +
                "]";
        
    }



}
