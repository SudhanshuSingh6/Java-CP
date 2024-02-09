package CodeChef;

import java.util.*;

public class CNDYGAME {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            StringBuilder str = new StringBuilder();
            int n = sc.nextInt();
            long[] arr = new long[n];
            long s = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if (arr[i] == 1) {
                    s = 1;
                }
            }
            if (arr[n - 1] == 1 || arr[n - 1] % 2 != 0 && s == 0) {
                long[] pre = new long[n];
                long p = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 != 0 && i != n - 1) {
                        p = p + arr[i] - 1;
                    } else {
                        p = p + arr[i];
                    }
                    pre[i] = p;
                }
                long q = sc.nextLong();
                for (int i = 0; i < q; i++) {
                    Long a = sc.nextLong();
                    long d = ((a / n) * pre[n - 1]);
                    if (a % n == 0) {
                        str.append(d % 1000000007);
                    } else {
                        if (arr[(int) (a % n) - 1] % 2 != 0) {
                            str.append((d + pre[(int) ((a % n) - 1)] + 1) % 1000000007);
                        } else {
                            str.append((d + pre[(int) ((a % n) - 1)]) % 1000000007);
                        }
                    }
                    str.append("\n");
                }
            } else if (arr[0] == 1) {
                int q = sc.nextInt();
                for (int i = 0; i < q; i++) {
                    long b = sc.nextLong();
                    if (b <= n + 1) {
                        str.append(1);
                    } else {
                        if (b % n == 1 || b % n == 0) {
                            str.append(((long) ((b / n))) % 1000000007);
                        } else {
                            str.append(((long) ((b / n)) + 1) % 1000000007);
                        }
                    }
                    str.append("\n");
                }
            } else {

                if (s == 0) {
                    long[] pre = new long[n];
                    long p = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 != 0 && i != n - 1) {
                            p = p + arr[i] - 1;
                            pre[i] = p;
                        } else {
                            if (i == n - 1 && arr[i] % 2 == 0) {
                                p = p + arr[i] - 1;
                            } else {
                                p = p + arr[i];
                            }
                            pre[i] = p;
                        }
                    }
                    int q = sc.nextInt();
                    for (int i = 0; i < q; i++) {
                        long b = sc.nextLong();
                        long d = (b / n) * pre[n - 1];
                        if ((b % n) == 0 && arr[n - 1] % 2 == 0) {
                            str.append((d + 1) % 1000000007);
                        } else if (arr[(int) b % n - 1] % 2 != 0) {
                            str.append((d + 1 + pre[(int) (b % n) - 1]) % 1000000007);
                        } else {
                            str.append((d + pre[(int) (b % n) - 1]) % 1000000007);
                        }
                        str.append("\n");
                    }
                } else {
                    {
                        long[] pre = new long[n];
                        long p = 0;
                        for (int i = 0; i < n; i++) {
                            if (arr[i] == 1) {
                                pre[i] = p;
                                if (arr[i - 1] % 2 == 0) {
                                    p--;
                                } else {
                                    p = p + 1;
                                }
                            } else if (arr[i] % 2 != 0 && i != n - 1) {
                                p = p + arr[i] - 1;
                                pre[i] = p;
                            } else {
                                if (i == n - 1 && arr[i] % 2 == 0) {
                                    p = p + arr[i] - 1;
                                    pre[i] = p;
                                } else {
                                    p = p + arr[i];
                                    pre[i] = p;
                                }
                            }
                        }
                        int q = sc.nextInt();
                        for (long i = 0; i < q; i++) {
                            long b = sc.nextLong();
                            long d = ((b / n) * pre[n - 1]);
                            if ((b % n) == 0) {
                                if (arr[n - 1] % 2 == 0) {
                                    str.append((d + 1) % 1000000007);
                                } else {
                                    str.append((d) % 1000000007);
                                }
                            } else if (arr[(int) (b % n) - 1] % 2 != 0) {
                                str.append((d + 1 + pre[(int) (b % n) - 1]) % 1000000007);
                            } else {
                                str.append((d + pre[(int) (b % n) - 1]) % 1000000007);
                            }
                            str.append("\n");
                        }
                    }
                }
            }
            System.out.println(str);
        }
    }
}
