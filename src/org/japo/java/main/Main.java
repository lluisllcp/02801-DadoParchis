/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */

public class Main {
    public static final Random RND = new Random();
    public static void main(String[] args) {
      
   int dado;
    
    final int dado_MIN = 1;
    final int dado_MAX = 6;
    
    dado = RND.nextInt(dado_MAX - dado_MIN + 1) + dado_MIN; 
        
   System.out.printf("Tirada...: %d%n", dado);
    
    }
    
}
