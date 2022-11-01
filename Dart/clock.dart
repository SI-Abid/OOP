void main(List<String> args) {
  var bd = DateTime(DateTime.now().year, 1, 16);
  var met = DateTime(2020, 6, 22);
  var prop = DateTime(2020, 11, 17);
  var now = DateTime.now();
  var difference = bd.difference(now);
  if(difference.isNegative) {
    bd = bd.add(Duration(days: 365));
    difference = bd.difference(now);
  }
  print('i: ${difference.inDays} days');
  difference = now.difference(met);
  print('1st: ${difference.inDays} days');
  difference = now.difference(prop);
  print('<3: ${difference.inDays} days');
}
