 String line = sc.nextLine();
        Map<Integer, String> rrr = new HashMap<>();
        Map<Integer, Integer> rs = new HashMap<>();
        int id = 1;
        while (sc.hasNext()) {
            line = sc.nextLine().trim();
            int c = 0;
            int wc = 0;
            int dc = 0;
            int lc = 0;
            for (String s : line.split("")) {
                switch (s) {
                    case "W":
                        c += 2;
                        wc +=1;
                        break;
                    case "D":
                        c += 1;
                        dc += 1;
                        break;
                    case "L":
                        lc += 1;
                        break;
                }
            }
            rrr.put(id, String.format("%s %s %s %s %s", id,c,wc,dc,lc));
            rs.put(id++, c);
        }
        int goal = 1;
        int tmp = 0;
        for (Integer tid : rs.keySet()) {
            if (rs.get(tid) > tmp) {
                goal = tid;
                tmp = rs.get(tid);
            }
        }
        System.out.print(rrr.get(goal));
