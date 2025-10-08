import React from 'react';
import { useState } from 'react';

export const CharLength = () => {
    const [userInput, setUserInput] = useState(0);
  return (
    <>
    <br></br>
    <textarea name="Info" id="Info" rows={10} cols={30} onChange={(e)=>setUserInput(e.target.value)}></textarea>
    <div>Character count: {userInput.length}</div>
    </>
  );
};
