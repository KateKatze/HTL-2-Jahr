Set<Person> = new TreeSet<>();
                        = new TreeSet<>(new Comp());
Set<Integer> s = new TreeSet<>();
while(s.size()) < 6){
s.add(rnd);
}

gleich auch sortiert - treeset
schneller - hashset

TreeSet
0 1 3 5 7 9 14 15 16 17
copies ignored: 3

HashSet
16 0 2 6 7 8 9 11 12 15
copies ignored: 0

implementiert Comparable - natürliche Reihenfolge
Comparator - kleinste/größte zuerst
